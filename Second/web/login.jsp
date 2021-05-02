<%--
  Created by IntelliJ IDEA.
  User: Eleven
  Date: 2021/4/25
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>


<form name = "reg" action="LoginServlet" method="post">
    <meta charset="UTF-8">
    账号：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    <input type="submit" value="登录" >
<%--    设置跳转页面要记得改按钮类型--%>
    <input type="button" value="注册"  onclick="window.location.href='http://localhost:8080/Second/register.jsp'">
</form>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
