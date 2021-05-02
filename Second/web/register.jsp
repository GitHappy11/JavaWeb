<%--
  Created by IntelliJ IDEA.
  User: Eleven
  Date: 2021/4/25
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Second</title>
  </head>
  <body>
  <jsp:include page="head.jsp"></jsp:include>

  <form name = "reg" action="RegisterServlet" method="post">
    <meta charset="UTF-8">
    账号：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    年龄：<input type="text" name="age"/><br>
    性别：男<input type="radio" name="sex" value="男" checked="checked">女<input type="radio" name="sex" value="女" checked="checked">
    <input type="submit" value="注册" >
  </form>

  <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
