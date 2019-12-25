<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ユーザー一覧削除確認</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>userListDeleteConfirm</p>
		</div>
		<div>
			<h3>全てのユーザーを削除します。よろしいですか？</h3>
			<s:form action="UserListDeleteCompleteAction">
				<s:submit value="OK"/>
			</s:form>
			<s:form action="AdminAction">
				<s:submit value="キャンセル"/>
			</s:form>
		</div>
	</div>
	<div id="footer">
	</div>

</body>
</html>