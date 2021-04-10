<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculate</title>
    <meta charset="utf-8">

    <link rel="stylesheet" href="calculate.css">
</head>
<body>
    <div class="rezult" >
        <h3>
            Результат вычисления
        </h3>

        <a href="/mvnweb_war_exploded/index.jsp">Домой</a>
        <hr>
        <p>
            ваше первое число = <span class="numcal_1">${num1}</span>
        </p>
        <p>
            ваше второе число = <span class="numcal_2">${num2}</span>
        </p>
        <p>
            ваше действие = <span class="devcal">${todoCalculate}</span>
        </p>
        <hr>
        <p>
            ваш результат = <span class="rez">${rez}</span>
        </p>
    </div>

</body>
</html>
