<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemCreate画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>商品登録</p>
		</div>
		<div>
			<table>
				<s:form action="ItemCreateConfirmAction">
					<tr>
						<td>
							<label>商品名</label>
						</td>
						<td><input type="text" name="newItemName" value="" /></td>
					</tr>
					<tr>
						<td><label>値段</label></td>
						<td><input type="text" name="newItemPrice" value="" /></td>
					</tr>
					<tr>
						<td><label>在庫</label></td>
						<td><input type="text" name="newItemStock" value="" /></td>
					</tr>
					<s:submit value="登録"/>
				</s:form>
			</table>
		</div>
	</div>
	<div id="footer">
	</div>

</body>
</html>