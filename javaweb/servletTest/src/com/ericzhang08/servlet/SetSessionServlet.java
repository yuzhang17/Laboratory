package com.ericzhang08.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        System.out.println(session.isNew());
        session.setAttribute("key1", "key2");
        resp.getWriter().write("set session success, session id:" + session.getId());
    }
}
