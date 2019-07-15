<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-10
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import= "model.Question" %>
<% Question question = (Question) request.getAttribute("Question"); %>

<html>
<head>
    <title>回答画面</title>
</head>
<body>

<jsp:include page="../helperUIkit.html"/>
<div class="uk-container uk-container-large">

    <table>

        <html>
        <head><title>アンケート内容</title></head>

        <body bgcolor="skyblue">
        <br>

        <table border="1">
            <tr>
                <td> アンケート内容 </td>
                <td> <%= question.getQuestionItem() %> </td>
            </tr>
            <tr>
                <td> アンケート番号 </td>
                <td> <%= question.getQuestionItemId() %> </td>
            </tr>
            <tr>
                <td> 作成者ID</td>
                <td> <%= question.getUserId() %> </td>
            </tr>
        </table>
        <br>
        </body>
        </html>

    </table>
    <form class="uk-grid-small" action="ReplyInfo"
          method="post">
        <div class="uk-margin">
            アンケート番号:<input class="uk-text" type="text" id="QuestionItemId" name="QuestionItemId">
        </div>
        <div class="uk-margin">
            作成者ID:<input class="uk-text" type="text" id="UserId" name="UserId">
        </div>
        <div class="uk-margin">
            Your UserID:<input class="uk-text" type="text" id="id" name="id">
        </div>
        <div class="uk-margin">
            ５段階評価:
                <input type="radio" name="AnswerRank" value="1" id="1">1
                <input type="radio" name="AnswerRank" value="2" id="2">2
                <input type="radio" name="AnswerRank" value="3" id="3">3
                <input type="radio" name="AnswerRank" value="4" id="4">4
                <input type="radio" name="AnswerRank" value="5" id="5">5
        </div>
        <div class="uk-margin">
            評価理由:<input class="uk-text" type="text" id="AnswerContent" name="AnswerContent">
        </div>
        <div class="uk-margin">
            <button class="uk-button uk-button-primary">登録</button>
        </div>
    </form>
</div>
</body>
</html>
