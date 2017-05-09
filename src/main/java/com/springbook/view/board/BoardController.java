package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jun Ho Park on 2017-05-07.
 */
@Controller
public class BoardController {

    // 글 등록
    @RequestMapping("/insertBoard.do")
    public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
        System.out.println("글 등록 처리");

        boardDAO.insertBoard(vo);
        return "getBoardList.do";
    }

    // 글 수정
    @RequestMapping("/updateBoard.do")
    public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
        System.out.println("글 수정 처리");

        boardDAO.updateBoard(vo);
        return "getBoardList.do";
    }

    // 글 삭제
    @RequestMapping("/deleteBoard.do")
    public String handleRequest(BoardVO vo, BoardDAO boardDAO) {
        System.out.println("글 삭제 처리");
        boardDAO.deleteBoard(vo);
        return "getBoardList.do";
    }

    // 글 상세 조회
    @RequestMapping("/getBoard.do")
    public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
        System.out.println("글 상세 조회 처리");

        model.addAttribute("board", boardDAO.getBoard(vo));
        return "getBoard.jsp";
    }

    // 글 목록 검색
    @RequestMapping("/getBoardList.do")
    public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
        System.out.println("글 목록 검색 처리");

        model.addAttribute("boardList", boardDAO.getBoardList(vo));
        return "getBoardList.jsp";
    }
}
