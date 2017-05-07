package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Jun Ho Park on 2017-05-06.
 */
@Controller
public class GetBoardListController {

    @RequestMapping("/getBoardList.do")
    public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
        System.out.println("글 목록 검색 처리");

        mav.addObject("boardList", boardDAO.getBoardList(vo));
        mav.setViewName("getBoardList.jsp");
        return mav;

        /*BoardVO vo = new BoardVO();
        BoardDAO boardDAO = new BoardDAO();
        List<BoardVO> boardList = boardDAO.getBoardList(vo);

        HttpSession session = request.getSession();
        session.setAttribute("boardList", boardList);

        ModelAndView mav = new ModelAndView();
        mav.addObject("boardList", boardList);
        mav.setViewName("getBoardList.jsp");
        return mav;*/
    }
}
