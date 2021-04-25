package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet
{

    //当对象被创建的时候的【第一次进入Servlet】
    public TestServlet()
    {
        System.out.println("构造方法，也是Init的一种");
    }

    @Override
    //当对象被创建的时候的【第一次进入Servlet】
    public void init() throws ServletException
    {
        super.init();
        System.out.println("Hello Servlet!");
    }

    @Override
    //当对象被销毁的时候【服务器关闭】
    public void destroy()
    {
        super.destroy();
        System.out.println("Bye Servlet!");
    }

    @Override
    //在接收信息【Post，Get】前会执行的方法
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("准备消息处理！");
        //执行消息处理方法
        super.service(req, resp);
    }

    //method="post"
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("接收到了Post信息！");
    }

    //method="Get"
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("接收到了Get信息！");
    }
}
