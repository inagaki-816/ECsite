<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ユーザー一覧</title>
</head>
<body>
     <div id="header">
     </div>
     <div id="main">
          <div id="top">
                 <p>userList</p>
          </div>
          <div>
              <s:if test="userInfoDTOList == null">
              <h3>ユーザーは登録されていません。</h3>
           </s:if>
           <h3>ユーザー一覧</h3>
           <table border = "1">
             <tr>
                <th>ユーザーID</th>
                <th>ユーザーパスワード</th>
                <th>ユーザー名</th>
                <th>登録日</th>
             </tr>
             <s:iterator value="userInfoDTOList">
             <tr>
                <td><s:property value="id"/></td>
                <td><s:property value="userPassword"/></td>
                <td><s:property value="userName"/></td>
                <td><s:property value="insert_date"/>
             </tr>
             </s:iterator>
           </table>
           <s:form action="UserListDeleteConfirmAction">
            <s:submit value="削除"/>
           </s:form>
          </div>
     </div>

</body>
</html>