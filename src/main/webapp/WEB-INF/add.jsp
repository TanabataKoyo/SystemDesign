<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-08
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>アンケート登録</title>
</head>
<body>
<jsp:include page="../helperUIkit.html"/>
<div class="uk-container uk-container-large">
    <form class="uk-grid-small" action="AddInfo"
          method="post">
        <div class="uk-margin">
            質問：<input class="uk-text" type="text" id="QuestionItem" name="QuestionItem">
        </div>
        <div class="uk-margin">
            質問番号 :<input class="uk-text" type="text" id="QuestionItemId" name="QuestionItemId">
        </div>
        <div class="uk-margin">
            UserID :<input class="uk-text" type="text" id="UserId" name="UserId">
        </div>
        <div class="uk-margin">
            <button class="uk-button uk-button-primary">登録</button>
        </div>
    </form>
</div>

</body>
</html>
