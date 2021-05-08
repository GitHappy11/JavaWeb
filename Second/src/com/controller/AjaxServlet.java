package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("收到了一个Ajax请求！"+request.getParameter("data"));

        //服务器向客户端发送数据

        //设置编码格式
        response.setContentType("text/html;charset=UTF-8");
        //具体发送的数据
        response.getWriter().append("网页收到数据");
    }
}
