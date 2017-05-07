package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

/**
 * Created by Jun Ho Park on 2017-05-06.
 */

@Controller
public class InsertBoardController {

    @RequestMapping("/insertBoard.do")
    public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
        System.out.println("글 등록 처리");

        boardDAO.insertBoard(vo);
        return "redirect:getBoardList.do";

       /* String title = request.getParameter("title");
        String writer = request.getParameter("writer");
        String content = request.getParameter("content");*/

       /* BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setWriter(writer);
        vo.setContent(content);

        BoardDAO boardDAO = new BoardDAO();
        boardDAO.insertBoard(vo);*/

       /* ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:getBoardList.do");
        return mav;*/
    }
}
