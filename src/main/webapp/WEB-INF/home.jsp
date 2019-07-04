<%--
  Created by IntelliJ IDEA.
  User: k.battan2
  Date: 2019-07-04
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="model.User" %>
<% User user = (User) request.getAttribute("user");%>
<% String name = null;
    if (request.getAttribute("entry") != null) {
        name = (String) request.getAttribute("entry");}
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
        ・ユーザ名:<%= user.getName()%><br>
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
