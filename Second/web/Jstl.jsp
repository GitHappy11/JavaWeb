<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/7
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入规则和标签--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL测试</title>
</head>
<body>
<%--使用标签来代替Request等对象--%>
<%--下面的这句话就等于 <%request.setAttribute("username","JSTLtest");%>--%>
<c:set var="username" value="JSTLtest"  scope="request"></c:set>
<%--以下两种方式都可以取出,一般情况都使用EL表达式--%>
<c:out value="${username}"></c:out>
${username}

<%--也可以使用判断语句--%>
<c:set var="salary" scope="session" value="${"0"}"/>
<%--<c:if test="${salary > 2000}">--%>
<%--&lt;%&ndash;如果不符合条件下面这条就不会显示&ndash;%&gt;--%>
<%--<p>我的工资为: <c:out value="${salary}"/><p>--%>
<%--</c:if>--%>

<%--    <c:set var="salary" scope="session" value="${2000*2}"/>--%>
<%--<p>你的工资为 : <c:out value="${salary}"/></p>--%>

<%--<c:choose>标签与Java switch语句的功能一样，用于在众多选项中做出选择。--%>
<%--switch语句中有case，而<c:choose>标签中对应有<c:when>，switch语句中有default，而<c:choose>标签中有<c:otherwise>。--%>

<c:choose>
    <c:when test="${salary <= 0}">
        太惨了。
    </c:when>
    <c:when test="${salary > 1000}">
        不错的薪水，还能生活。
    </c:when>
    <c:otherwise>
        什么都没有。
    </c:otherwise>
</c:choose>

</body>
</html>
