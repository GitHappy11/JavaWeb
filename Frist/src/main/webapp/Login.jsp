<%@ page import="com.example.FirstJavaWeb.DBUtil" %>
<%@ page import="com.user.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>

</head>
<body>
<h1>我来处理一些登录的请求</h1>
<%!
    String username; String password;
%>
<%
    username=request.getParameter("username");
    password=request.getParameter("password");


    out.println(username+"---"+password+request.getAttribute("message"));

    User user= DBUtil.VerifyAccount(username,password);
    if (user!=null)
    {
        out.println("登录成功！该账号的性别是："+user.getSex());
        //消息包传入
        request.setAttribute("user",user);
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
        out.println("登录失败！请检查账号密码!");
    }
%>
</body>
</html>
