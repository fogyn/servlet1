<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Later</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="main.css">
</head>
<body>
<h3>
    Цитата
</h3>

<a href="/mvnweb_war_exploded/index.jsp">Домой</a>
<hr>
<div class="let">
    <p>
        ${letter}
    </p>
</div>

</body>
</html>
