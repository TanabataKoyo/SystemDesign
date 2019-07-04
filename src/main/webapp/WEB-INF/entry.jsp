<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生情報登録</title>
</head>
<body>
    <link rel="stylesheet" href="uikit.min.css">
       <script src="uikit.min.js">
       </script>
<div class="uk-container uk-container-large">
    <form class="uk-grid-small" action="./WEB-INF/entry.jsp"
          method="post">
        <div class="uk-margin">
            名前：<input class="uk-text" type="text" id="name" name="name">
        </div>
        <div class="uk-margin">
            学籍番号:<input class="uk-text" type="studentid" id="id" name="id">
        </div>
        <div class="uk-margin">
            <button class="uk-button uk-button-primary">登録</button>
        </div>
</div>
</body>
</html>