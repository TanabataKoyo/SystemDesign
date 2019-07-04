<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-04
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ホーム画面</title>
</head>
<body>
    <link rel="stylesheet" href="uikit.min.css">
    <script src="uikit.min.js">
    </script>

    <div class="uk-container uk-container-large">

    <h2><a href="" class=""></a>Hello QuestionSystem!!</h2>
    <h4>
        登録情報<br>
        ・ユーザ名:<%= .getName()%><br>
        ・学籍番号:<%= user.getId()%>

    </h4>
    </div>
</body>

<script>
    <% if(name != null){
    %>
    var json = [
        {
            name: "登録に成功しました！"
        }
    ]
    alert(json[0].name);
    <%}else{
    }%>
</script>
</html>
