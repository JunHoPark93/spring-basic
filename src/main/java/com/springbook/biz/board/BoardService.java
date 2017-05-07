package com.springbook.biz.board;

import java.util.List;

/**
 * Created by Jun Ho Park on 2017-05-03.
 */
public interface BoardService {

    void insertBoard(BoardVO vo);

    void updateBoard(BoardVO vo);

    void deleteBoard(BoardVO vo);

    BoardVO getBoard(BoardVO vo);

    List<BoardVO> getBoardList(BoardVO vo);
}
