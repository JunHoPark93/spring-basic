package com.springbook.view.user;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Jun Ho Park on 2017-05-07.
 */
@Controller
public class LoginController {

    /*@RequestMapping("/login.do")
    public String login(UserVO vo, UserDAO userDAO) {
        System.out.println("로그인 처리");

        if(userDAO.getUser(vo) != null)
            return "getBoardList.do";
        else
            return "login.jsp";


    }*/

    @RequestMapping(value="/login.do", method = RequestMethod.GET)
    public String loginView(@ModelAttribute("user") UserVO vo) {
        System.out.println("로그인 화면으로 이동");
        vo.setId("test");
        vo.setPassword("test123");
        return "login.jsp";
    }

    @RequestMapping(value="/login.do", method = RequestMethod.POST)
    public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
        System.out.println("로그인 인증 처리");
        /*if(userDAO.getUser(vo) != null)
            return "getBoardList.do";
        else
            return "login.jsp";*/
        UserVO user = userDAO.getUser(vo);
        if(user!=null) {
            session.setAttribute("userName", user.getName());
            return "getBoardList.do";
        } else {
            return "login.jsp";
        }
    }
}
