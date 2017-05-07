package com.springbook.view.user;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jun Ho Park on 2017-05-07.
 */
public class LoginController implements Controller{

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("로그인 처리");
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPassword(password);

        UserDAO userDAO = new UserDAO();
        UserVO user = userDAO.getUser(vo);

        ModelAndView mav = new ModelAndView();
        if(user!=null) {
            mav.setViewName("redirect:getBoardList.do");
        } else {
            mav.setViewName("redirect:login.jsp");
        }

        return mav;
    }
}
