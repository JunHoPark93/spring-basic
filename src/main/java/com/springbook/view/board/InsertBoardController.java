package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jun Ho Park on 2017-05-06.
 */
public class InsertBoardController implements Controller {
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("글 등록 처리");

        String title = request.getParameter("title");
        String writer = request.getParameter("writer");
        String content = request.getParameter("content");

        BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setWriter(writer);
        vo.setContent(content);

        BoardDAO boardDAO = new BoardDAO();
        boardDAO.insertBoard(vo);

        return "getBoardList.do";
    }
}
