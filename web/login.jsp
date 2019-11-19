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
<html lang="ja">
<head>
    <title>システムログイン</title>
    <script type="text/javascript">
        function PushLoginButton() {
            var usersLoginName = document.inform.usersLoginName;
            if ( usersLoginName == "" ) {
                alert("ログインIDを入力してください。");
                return false;
            }
            var usersLoginPassword = document.inform.usersLoginPassword;
            if ( usersLoginPassword == "" ) {
                alert("パスワードを入力してください。");
                return false;
            }
            document.inform.BUTTON_ID.value = '101_01_01';
            document.inform.submit();
        }
    </script>
</head>

<body>
    <div align="center">
        <h1>お客様情報管理システム<br>ログイン画面</h1>
    </div>
    <div style="color: red; font-weight: bold" align="center" >
        <form action="/Presentation/FrontControllerServlet" method="post" name="inform">
        <c:out value="${requestScope.message}" />
    </div>
        <input type="hidden" name="message" value="0" />
    <table>
        <tr>
            <td>
                ユーザーID:
            </td>
            <td>
                <input type="text" name="usersLoginName">
            </td>
        </tr>
        <tr>
            <td>
                パスワード:
            </td>
            <td>
                <input type="password" name="usersLoginPassword">
            </td>
        </tr>
    </table><br><br>
    <input type="hidden" value="" name="BUTTON_ID"/>
    <input type="button" value="login" onclick="return PushLoginButton()"/>
</form>
</body>
</html>
