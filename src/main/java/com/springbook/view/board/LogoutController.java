package com.springbook.view.board;

import com.springbook.view.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Jun Ho Park on 2017-05-06.
 */
public class LogoutController implements Controller {
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("로그아웃 처리");

        HttpSession session = request.getSession();
        session.invalidate();

        return "login";
    }
}
