<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品一覧削除完了</title>
</head>
<body>
    <div id="header">
    </div>
    <div id="main">
        <div id="top">
              <p>itemListDeleteComplete</p>
        </div>
        <div>
            <h3><s:property value="message"/></h3>
           <a href='<s:url action="AdminAction"/>'>管理者TOPへ</a>
        </div>
    </div>
    <div id="header">
    </div>

</body>
</html>