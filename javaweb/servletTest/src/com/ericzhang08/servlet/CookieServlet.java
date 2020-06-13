package com.ericzhang08.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key1", "");
        Cookie cookie2 = new Cookie("key2", "value2");
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        cookie.isHttpOnly();
        resp.getWriter().write("success");

        for (Cookie reqCookie : req.getCookies()) {
            System.out.println("name:" + reqCookie.getName());
            System.out.println("value:" + reqCookie.getValue());
            System.out.println("domain" + reqCookie.getDomain());
            System.out.println("path" + reqCookie.getPath());

        }


    }
}
