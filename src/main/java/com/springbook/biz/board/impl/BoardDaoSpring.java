package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jun Ho Park on 2017-05-05.
 */
@Repository
public class BoardDaoSpring {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values((select ifnull(max(seq), 0)+1 from board b),?,?,?)";
    //private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values(?,?,?,?)";
    private final String BOARD_UPDATE = "update board set title = ?, content = ? where seq = ?";
    private final String BOARD_DELETE = "delete boared where seq = ?";
    private final String BOARD_GET = "select * from board where seq = ?";
    private final String BOARD_LIST = "select * from board order by seq desc";

/*
    @Autowired
    public void setSuperDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }
*/

    public void insertBoard(BoardVO vo) {
        System.out.println("spring jdbc로 insertBoard()");
        jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
    }

    public void updateBoard(BoardVO vo) {
        System.out.println("spring jdbc로 udpateBoard()");
        jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
    }

    public void deleteBoard(BoardVO vo) {
        System.out.println("spring jdbc로 deleteBoard()");
        jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
    }

    public BoardVO getBoard(BoardVO vo) {
        System.out.println("spring jdbc로 getBoard()");
        Object[] args = {vo.getTitle()};
        return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
    }

    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("spring jdbc로 getBoardList()");
        return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
    }
}

class BoardRowMapper implements RowMapper<BoardVO> {
    public BoardVO mapRow(ResultSet rs, int i) throws SQLException {
        BoardVO board = new BoardVO();
        board.setSeq(rs.getInt("SEQ"));
        board.setTitle(rs.getString("TITLE"));
        board.setContent(rs.getString("WRITER"));
        board.setRegDate(rs.getDate("REGDATE"));
        board.setCnt(rs.getInt("CNT"));
        return board;
    }
}




