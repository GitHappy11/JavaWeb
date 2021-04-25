<%@ page import="com.example.FirstJavaWeb.DBUtil" %>
<%@ page import="com.user.model.User" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/4
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理注册请求</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    String sex=request.getParameter("sex");
    int age=Integer.parseInt(request.getParameter("age"));

    boolean isSuccess= DBUtil.AddUser(username,password,age,sex);
    if (isSuccess)
    {
        out.println("<font color='green'> 注册成功！跳转至登录界面</font><br>");
        //将注册成功的消息存入request中，第一个参数是Key，第二个是Object
        request.setAttribute("message","注册成功");
        //跳转至登录界面，然后把两个消息包发送给它，让它去处理 这里不会重新创建。它已经是一个在使用中的对象了
        request.getRequestDispatcher("Login.jsp").forward(request,response);
    }
    else
    {
        //这里虽然提示异常，但是还是可以逻辑还是可以运行，只是IDEA觉得是错的
%>
        <font color="red">注册失败</font>
<%
    }

    //遍历用户字典
    if (DBUtil.userDB!=null)
    {
        for (Map.Entry<String, User> test : DBUtil.userDB.entrySet()) {
            out.println("Key = " + test.getKey() + ", Value = " + test.getValue().getPassword()+"<br>");
        }
    }



%>
</body>
</html>
