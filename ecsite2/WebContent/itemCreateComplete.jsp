<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品登録完了</title>
</head>
<body>
    <div id="header">
    </div>
    <div id="main">
        <div id="top">
              <p>itemCreateComplete</p>
        </div>
        <div>
             <h3>商品の登録が完了しました。</h3>

             <div>
                <p>商品の一覧は
                <a href='<s:url action="ItemListAction"/>'>こちら</a></p>
                <a href='<s:url action="AdminAction"/>'>管理者TOPへ</a>
             </div>
        </div>
    </div>

</body>
</html>