<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.user.model.User" %>
<%@ page import="com.example.FirstJavaWeb.DBUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "你好Happy11。我是你的第一个JavaWeb项目" %>

</h1>
<%! int count=0; Object o=null; %>
<%

    o=session.getAttribute("user");

    if (o!=null)
    {
        User user=(User)o;
        out.println("当前登录用户："+user.getUsername());
    }

    if (application.getAttribute("userNum")!=null)
    {
        out.println("当前登录用户数量："+ DBUtil.userNum);
    }


%>
<h5>注册<h5/>
<%--    action指明了消息包往哪一个文件发送。--%>
<form action="RegisterServlet" method="post">
    账号：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    年龄：<input type="text" name="age"/><br>
    性别：男<input type="radio" name="sex" value="男"/>女<input type="radio" name="sex" value="女"/>
    <input type="submit" value="注册"/>
</form>
    <br>
    <h5>登录<h5/>
        <form action="LoginServlet" method="post">
            <input type="text" name="username"/>
            <input type="password" name="password"/>
            <input type="submit" value="登录"/>
        </form>



<%--<a href="hello-servlet">Hello Servlet--%>
<%--</a>--%>
</body>
</html>