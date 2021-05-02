package com.controller;

import com.model.User;
import com.service.UserService;
import sun.awt.windows.WPrinterJob;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        User user=UserService.login(username,password);
        if (user!=null)
        {
            request.getSession().setAttribute("user",user);
            // 跳转到主页 不同的用户权限有不同的页面状态 使用重定向，需要路径， 无需传输数据
            request.setAttribute("msg","<font color='red'>登录成功！当前登录用户：</font>"+user.getUsername());
            if (user.isAdmin())
            {
                response.sendRedirect("GoodsListServlet");
            }
            else
            {
                request.getRequestDispatcher("/").forward(request,response);

            }
        }
        else
        {
            request.setAttribute("msg","<font color='red'>用户名或密码错误，请重新登录</font>");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }


    }





}
