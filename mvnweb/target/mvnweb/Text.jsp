<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Text</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="main.css">
</head>
<body>
<h3>
    Текст
</h3>

<a href="/mvnweb_war_exploded/index.jsp">Домой</a>

<hr>

<div class="text">
    <p>
        Всего гласных = ${gl}
    </p>

    <div>
        <p>
            Список всех гласных :
        </p>
        <c:forEach items="${gl_list}" var="item">
            <tr>
                <td><c:out value="${item}" /></td>
            </tr>
        </c:forEach>
    </div>

    <p>
        Всего согласных = ${sogl}
    </p>
    <div>
        <p>
            Список согласных :
        </p>
        <c:forEach items="${sogl_list}" var="item">
            <tr>
                <td><c:out value="${item}" /></td>
            </tr>
        </c:forEach>
    </div>
    <p>
        Всего знаков припинания = ${punkt}
    </p>
    <div>
        <p>
            Список знаков препинания :
        </p>
        <c:forEach items="${punkt_list}" var="item">
            <tr>
                <td><c:out value="${item}" /></td>
            </tr>
        </c:forEach>
    </div>
</div>

</body>
</html>
