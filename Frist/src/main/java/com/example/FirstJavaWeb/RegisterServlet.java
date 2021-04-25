package com.example.FirstJavaWeb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet") //注解，和注释不一样，它表明了这个类的访问路径
public class RegisterServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //向网页输入文本（可以写Html代码）
        response.getWriter().append("Ser at").append(request.getContextPath());
    }

    @Override
    //接收到消息包后处理方法
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sex=request.getParameter("sex");
        int age=Integer.parseInt(request.getParameter("age"));


        boolean isSuccess=DBUtil.AddUser(username,password,age,sex);
        if (isSuccess)
        {
            //这里的中文无法直接显示，显示信息的话还是使用HTML代码进行显示比较好
            response.getWriter().append("<font color='green'> 注册成功！来自Servlet的提示</font><br>");
            //将注册成功的消息存入request中，第一个参数是Key，第二个是Object
            request.setAttribute("message","注册成功");
            //（请求转发）跳转至登录界面，然后把两个消息包发送给它，让它去处理 这里不会重新创建。它已经是一个在使用中的对象了
//            request.getRequestDispatcher("Login.jsp").forward(request,response);
            //重定向 和转发有什么区别？（没有消息包，且JSP会切回Login.Jsp（转发不会，还是会停留在Register.jsp文件里））
            response.sendRedirect("Login.jsp");
        }
        else
        {
            response.getWriter().append("<font color='red'> 注册失败！来自Servlet的提示</font><br>");
        }
    }
}
