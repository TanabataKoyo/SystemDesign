<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-10
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>回答画面</title>
</head>
<body>

<jsp:include page="../helperUIkit.html"/>
<div class="uk-container uk-container-large">
    <form class="uk-grid-small" action="ResponsingInfo"
          method="post">
        <div class="uk-margin">
            UserID:<input class="uk-text" type="text" id="id" name="id">
        </div>
        <div class="uk-margin">
            ５段階評価:
            <form action="radio.php" method="post">
                <input type="radio" name="number" value="1" id="1">1
                <input type="radio" name="number" value="2" id="2">2
                <input type="radio" name="number" value="3" id="3">3
                <input type="radio" name="number" value="4" id="4">4
                <input type="radio" name="number" value="5" id="5">5
            </form>
        </div>
        <div class="uk-margin">
            評価理由:<input class="uk-text" type="text" id="content" name="content">
        </div>
        <div class="uk-margin">
            <button class="uk-button uk-button-primary">登録</button>
        </div>
    </form>
</div>
</body>
</html>
