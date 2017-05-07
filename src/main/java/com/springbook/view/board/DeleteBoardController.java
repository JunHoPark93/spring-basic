package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jun Ho Park on 2017-05-06.
 */
public class DeleteBoardController implements Controller{
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("글 삭제 처리");

        String seq = request.getParameter("seq");

        BoardVO vo = new BoardVO();
        vo.setSeq(Integer.parseInt(seq));

        BoardDAO boardDAO = new BoardDAO();
        boardDAO.deleteBoard(vo);

        return "getBoardList.do";
    }
}
