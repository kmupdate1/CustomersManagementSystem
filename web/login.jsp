<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 2019/11/19
  Time: 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>システムログイン</title>
</head>
<body>
<div style="color: red; font-weight: bold" >
    <c:out value="${requestScope.error}" />
</div>
<form action="/????" method="post">
    <input type="hidden" name="users_id" value="0">
    <table>
        <tr>
            <td>
                ユーザーID:
            </td>
            <td>
                <input type="text" name="users_id">
            </td>
        </tr>
        <tr>
            <td>
                パスワード:
            </td>
            <td>
                <input type="password" name="users_password">
            </td>
        </tr>
    </table><br><br>
    <input type="submit" value="login" />
    <input type="reset" value="cancel">
</form>
</body>
</html>
