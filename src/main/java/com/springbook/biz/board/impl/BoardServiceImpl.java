package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Log4jAdvice;
import com.springbook.biz.common.LogAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jun Ho Park on 2017-05-03.
 */

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardDaoSpring boardDAO;
    //private LogAdvice log;
    //private Log4jAdvice log;

    public void insertBoard(BoardVO vo) {
       /* if(vo.getSeq() == 0) {
            throw  new IllegalArgumentException("0번 글은 등록할 수 없습니다");
        }*/
        boardDAO.insertBoard(vo);
    }

    public void updateBoard(BoardVO vo) {
        boardDAO.updateBoard(vo);
    }

    public void deleteBoard(BoardVO vo) {
        boardDAO.deleteBoard(vo);
    }

    public BoardVO getBoard(BoardVO vo) {
        //log.printLogging();
        return boardDAO.getBoard(vo);
    }

    public List<BoardVO> getBoardList(BoardVO vo) {
        //log.printLogging();
        return boardDAO.getBoardList(vo);
    }
}
