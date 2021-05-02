<%--
  Created by IntelliJ IDEA.
  User: Eleven
  Date: 2021-05-02
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<%
    Object user=session.getAttribute("user");
    if (user==null)
    {
        request.setAttribute("msg","<font color='green'>你还未登录，请先登录</font>");
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
%>
我是主页
</body>
</html>
