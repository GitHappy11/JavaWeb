<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/7
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JQ ajax</title>
    <script src="${pageContext.request.contextPath}/JS/jquery.js"></script>

   <script>
       setInterval(()=>
       {
           $.ajax
           ({
                url:"${pageContext.request.contextPath}/AjaxServlet?data=我是客户端发送的数据",
                type:"get",
                cache:false,
                success:function (msg)
                {
                    // 也可以使用EL
                    $("#msg").append(msg);
                }
           })
       },1000);
   </script>


</head>
<body>
<div id="msg"> </div>
</body>
</html>
