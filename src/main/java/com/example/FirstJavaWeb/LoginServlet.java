package com.example.FirstJavaWeb;

import com.user.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       String username=request.getParameter("username");
       String password=request.getParameter("password");
       //新建一个application 来处理事件
       ServletContext application=this.getServletContext();

        response.getWriter().append(username+"---"+password+request.getAttribute("message"));

        User user= DBUtil.VerifyAccount(username,password);
        if (user!=null)
        {
            response.getWriter().append("Success--Sex："+user.getSex());
            //消息包传入
            request.setAttribute("user",user);

            //建立一个Session来接收网页的Session
            HttpSession session= request.getSession();
            //利用Session来存储数据 记得在跳转之前就把数据传入
            session.setAttribute("user",user);
            if (application.getAttribute("userNum")==null)
            {
                application.setAttribute("userNum",DBUtil.userNum);
            }

            DBUtil.userNum++;


            request.getRequestDispatcher("PersonCenter.jsp").forward(request,response);


        }
        else
        {
            request.getRequestDispatcher("LoginFailed");
        }
    }
}
