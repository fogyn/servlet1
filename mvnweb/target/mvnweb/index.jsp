
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>DZ2</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="main.css">
</head>

<body>
    <h2>Hello World!</h2>
    <h3>
        Привет РУС
    </h3>

    <div>
        <p>
            task letter
        </p>
    </div>


    <form type="get" action="mvnweb_war_exploded/basic" method="GET">
          <input type="Submit" value="send"/>
    </form>


    <hr>


    <form type="get" action="mvnweb_war_exploded/average" method="GET" class="getform" style="width: 500px; margin: auto">
        <div>
            <p>
                task max, min, average
            </p>
        </div>
        <div class="number1">
            <p>
                Digital 1
            </p>
            <input type="number" name="num1">
        </div>
        <div class="number2">
            <p>
                Digital 2
            </p>
            <input type="number" name="num2">
        </div>
        <div class="number3">
            <p>
                Digital 3
            </p>
            <input type="number" name="num3">
        </div>

        <div class="radiobut">
            <p class="radio"><input name="todo" type="radio" value="Average"> Average</p>
            <p class="radio"><input name="todo" type="radio" value="Max"> Max    </p>
            <p class="radio"><input name="todo" type="radio" value="Min" > Min    </p>
        </div>


        <input type="Submit" name="send" value="send" class="senddev"/>

    </form>
    <hr>

        <p>
            task text
        </p>
    </div>

    <form type="get" action="mvnweb_war_exploded/text" method="GET" class="getformtext">
        <div class="number1">
            <p>
                Enter text
            </p>
            <input type="text" name="text">
        </div>
        <input type="Submit" name="send" value="send" class="sendtext"/>

    </form>

<hr>
    <form type="get" action="mvnweb_war_exploded/calculate" method="GET" class="getformcalculate">
        <div class="caltitle">
            <h2>
                Калькулятор
            </h2>
        </div>
        <div class="digital1">
            <p>
                Digital 1
            </p>
            <input type="number" name="num1">
        </div>
        <div class="todocalculate">
            <p class="caldev"><input name="todoCalculate" type="radio" value="sum"> +</p>
            <p class="caldev"><input name="todoCalculate" type="radio" value="minus"> -    </p>
            <p class="caldev"><input name="todoCalculate" type="radio" value="multiple" > *    </p>
            <p class="caldev"><input name="todoCalculate" type="radio" value="devision" > /    </p>
            <p class="caldev"><input name="todoCalculate" type="radio" value="procent" > %    </p>
            <p class="caldev"><input name="todoCalculate" type="radio" value="stepen" > ^    </p>
        </div>
        <div class="digital2">
            <p>
                Digital 2
            </p>
            <input type="number" name="num2">
        </div>

        <input type="Submit" name="calsend" value="расчитать" class="calculatebut"/>

    </form>

    <div class="rezcalculate">
        <p>
            ${rezcalculate}
        </p>
    </div>
<hr>
    <form type="get" action="mvnweb_war_exploded/test" method="GET">
        <input type="Submit" name="test" value="проверка" />
    </form>
</body>
</html>
