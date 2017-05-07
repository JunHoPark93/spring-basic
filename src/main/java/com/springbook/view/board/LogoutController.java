package com.springbook.view.board;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Jun Ho Park on 2017-05-06.
 */
@Controller
public class LogoutController {
    @RequestMapping("/logout.do")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login.jsp";
/*        System.out.println("로그아웃 처리");

        HttpSession session = request.getSession();
        session.invalidate();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:login.jsp");
        return mav;*/
    }
}
