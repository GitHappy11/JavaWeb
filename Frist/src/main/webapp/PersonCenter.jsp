<%@ page import="com.user.model.User" %>
<%@ page import="java.nio.charset.StandardCharsets" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/4
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户中心界面</title>
    <%
        //使用强转获得User对象
        User user=(User) request.getAttribute("user");
        String sex= user.getSex();
        //先转码然后在转回utf-8 才能支持中文
 //       out.println(new String (sex.getBytes("iso-8859-1"),"utf-8"));

        User user1=(User) session.getAttribute("user");
//      int age=user1.getAge();
       out.println(user1.getAge());

    %>
</head>
<body>

</body>
</html>
