<%@ page import="java.util.List" %>
<%@ page import="com.model.Goods" %><%--
  Created by IntelliJ IDEA.
  User: Eleven
  Date: 2021-05-02
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理后台</title>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<h1>商品管理</h1><hr/>
<a>添加</a>
<table border="1">

    <tr> <td>商品名</td><td>描述</td><td>价格</td><td>库存</td><td>操作</td></tr>
    <%
        List<Goods> goodsLst=(List<Goods>)request.getAttribute("goodsLst");
        if (goodsLst!=null)
        {
        for (Goods goods: goodsLst)
        {
            //代码是连接起来的
    %>

    <tr>
<%--        使用<%=%>直接显示其内容 无需;--%>
        <td><%=goods.getName()%></td>
        <td><%=goods.getDes()%></td>
        <td><%=goods.getPrice()%></td>
        <td><%=goods.getInventory()%></td>
        <td>删除-修改</td>
    </tr>

    <%
        }
        }

    %>

<%--    <tr> <td>苹果</td><td>Apple</td><td>5</td><td>65</td><td>删除-修改</td></tr>--%>
<%--    <tr> <td>香蕉</td><td>Banana</td><td>6</td><td>33</td><td>删除-修改</td></tr>--%>
<%--    <tr> <td>西瓜</td><td>XiGua</td><td>8</td><td>54</td><td>删除-修改</td></tr>--%>






</table>
</body>
<style>
    *
    {
        font-size: 20px;
    }
</style>
</html>
