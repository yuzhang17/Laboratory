package com.ericzhang08.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("httpServlet get");
        //1、 获取 web.xml 中配置的上下文参数 context-param
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("context-param 参数 username 的值是:" + username);
        System.out.println("context-param 参数 password 的值是:" + context.getInitParameter("password"));
        // 2、 获取当前的工程路径， 格式: /工程路径System.out.println( "当前工程路径:" + context.getContextPath() );
        // 3、 获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("工程部署的路径是:" + context.getRealPath("/"));
        System.out.println("工程下 css 目录的绝对路径是:" + context.getRealPath("/css"));
        System.out.println("工程下 imgs 目录 1.jpg 的绝对路径是:" + context.getRealPath("/imgs/1.jpg"));
        // 获取 ServletContext 对象
        System.out.println(context);
        System.out.println("保存之前: Context1 获取 key1 的值是:" + context.getAttribute("key1"));
        context.setAttribute("key1", "value1");
        System.out.println("Context1 中获取域数据 key1 的值是:" + context.getAttribute("key1"));
//        super.doGet(req, resp);


        System.out.println("URI => " + req.getRequestURI());
        System.out.println("URL => " + req.getRequestURL());
        System.out.println("客户端 ip 地址 => " + req.getRemoteHost());
        System.out.println("请求头 User-Agent ==>> " + req.getHeader("User-Agent"));
        System.out.println( "请求的方式 ==>> " + req.getMethod() );

//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String[] hobby = req.getParameterValues("hobby");


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/hello");
        // RequestDispatcher requestDispatcher = req.getRequestDispatcher("http://www.baidu.com");
        requestDispatcher.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("httpServlet post");

        super.doPost(req, resp);
    }
}
