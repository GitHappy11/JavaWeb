package com.controller;

import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //设置编码 防止乱码
        request.setCharacterEncoding("utf-8");
        //得到用户的数据
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        int age=Integer.parseInt(request.getParameter("age"));

        boolean isSuccess=UserService.register(username,password,age);
        System.out.println(isSuccess);

        if (isSuccess)
        {
            request.setAttribute("msg","<font color='green'>注册成功，请登录！</font>");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            System.out.println("跳转到登录界面");
        }
        else
        {
            request.setAttribute("msg","<font color='red'>注册失败，请重新注册！</font>");
            request.getRequestDispatcher("register.jsp").forward(request,response);
            System.out.println("跳转到注册界面");
        }
    }


}
