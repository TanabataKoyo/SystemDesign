<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生情報登録</title>
</head>
<body>
<jsp:include page="../helperUIkit.html"/>
<div class="uk-container uk-container-large">
    <form class="uk-grid-small" action="EntryInfo"
          method="post">
        <div class="uk-margin">
            名前：<input class="uk-text" type="text" id="name" name="name">
        </div>
        <div class="uk-margin">
            学籍番号:<input class="uk-text" type="text" id="id" name="id">
        </div>
        <div class="uk-margin">
            <button class="uk-button uk-button-primary">登録</button>
        </div>
</div>
</body>
</html>