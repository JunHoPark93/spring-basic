package com.springbook.view.user;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jun Ho Park on 2017-05-07.
 */
@Controller
public class LoginController {

    @RequestMapping("/login.do")
    public String login(UserVO vo, UserDAO userDAO) {
        System.out.println("로그인 처리");

        if(userDAO.getUser(vo) != null)
            return "getBoardList.do";
        else
            return "login.jsp";

        /*String id = request.getParameter("id");
        String password = request.getParameter("password");

        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPassword(password);

        UserDAO userDAO = new UserDAO();
        UserVO user = userDAO.getUser(vo);

        ModelAndView mav = new ModelAndView();
        if(user!=null) {
            System.out.print("wpeofhefmdjah");
            mav.setViewName("redirect:getBoardList.do");
        } else {
            mav.setViewName("redirect:login.jsp");
        }

        return mav;*/
    }
}
