<%--
  Created by IntelliJ IDEA.
  User: Eleven
  Date: 2021/4/25
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        if (request.getAttribute("msg")!=null)
        {
            String msg=(String)request.getAttribute("msg");
        }
    %>


</head>
<body>
<%--这里使用的是EL表达式，可以直接获得--%>
----${msg }----<br/>
</body>
</html>
