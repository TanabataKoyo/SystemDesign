<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-16
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Answer" %>
<% Answer answer = (Answer) request.getAttribute("Answer"); %>
<html>
<head>
    <title>回答結果表示</title>
</head>
<body>
<jsp:include page="../helperUIkit.html"/>
<div class="uk-container uk-container-large">

    <table>

        <html>
        <head><title>アンケート内容</title></head>

        <body bgcolor="skyblue">
        <br>

        <table border="1" width="500"700×300>

            <tr>
                <td> 回答内容 </td>
                <td> <%= answer.getAnswerContent() %> </td>
            </tr>
            <tr>
                <td> 5段階評価 </td>
                <td> <%= answer.getAnswerRank() %> </td>
            </tr>
            <tr>
                <td> アンケート番号 </td>
                <td> <%= answer.getQuestionItemId() %> </td>
            </tr>
            <tr>
                <td> 回答者ID</td>
                <td> <%= answer.getRespondentId() %> </td>
            </tr>
        </table>
        <br>
        </body>
        </html>
    </table>
</div>
<a href="SearchInfo">ホーム画面へ</a>
</body>
</html>