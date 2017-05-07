<%@ page import="com.springbook.biz.user.UserVO" %>
<%@ page import="com.springbook.biz.user.impl.UserDAO" %><%--
  Created by IntelliJ IDEA.
  User: Jun Ho Park
  Date: 2017-05-05
  Time: 오후 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");

    UserVO vo = new UserVO();
    vo.setId(id);
    vo.setPassword(password);

    UserDAO userDAO = new UserDAO();
    UserVO user = userDAO.getUser(vo);

    if(user!=null) {
        response.sendRedirect("getBoardList.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>
