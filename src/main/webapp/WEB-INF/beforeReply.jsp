<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-11
  Time: 01:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>アンケート要求画面</title>
</head>
<body>
<jsp:include page="../helperUIkit.html"/>
<div class="uk-container uk-container-large">
    <form class="uk-grid-small" action="FindInfo"
          method="post">
        <div class="uk-margin">
            回答するアンケートの作成者の学籍番号を入力：<input class="uk-text" type="text" id="userId" name="userId">
        </div>
        <div class="uk-margin">
            回答するアンケート番号を入力：<input class="uk-text" type="text" id="QuestionItemId" name="QuestionItemId">
        </div>
        <div class="uk-margin">
            <input type="submit" name="OK">
        </div>
    </form>
</body>
</html>
