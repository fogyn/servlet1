<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AverageMaxMin</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="main.css">
</head>
<body>
<h3>
    Среднее, Максимальное, Минимальное
</h3>

<a href="/mvnweb_war_exploded/index.jsp">Домой</a>
<hr>
<div>
    <p>
        Первое число = ${num1}
    </p>
    <p>
        Первое число = ${num2}
    </p>
    <p>
        Первое число = ${num3}
    </p>
    <hr>
    <p>
        Выбранное действие ${todo} : Результат ${rezult}
    </p>


</div>


</body>
</html>
