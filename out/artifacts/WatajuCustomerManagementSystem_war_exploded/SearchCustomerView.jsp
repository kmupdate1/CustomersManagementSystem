<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 2019/11/19
  Time: 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>お客様情報の検索</title>
    <script type="text/javascript">
        function PushSearchButton() {
            var customerId = document.inform.CUSTOMER_ID.value;
            if ( customerId == "" ) {
                alert("顧客IDが未入力です。");
                return false;
            }

            document.inform.BUTTON_ID.value='後から決める0';
            document.inform.submit();
        }
    </script>
</head>
<body>
<div align="center" style="color: aqua">
    <c:out value="${requestScope.message}" />
</div>

<!-- ここのactionが意味わかんないから後で修正 -->
<form action="login" method="post" name="inform">
    <input type="hidden" name="BUTTON_ID" value="">
    <div align="center">
        <table>
            <tr>
                <td nowrap align="left">顧客ID<td/>
                <td nowrap align="left">
                    <input type="text" name="CUSTOMER_ID" value="${param.CUSTOMER_ID}" maxLength="10" size="10">
                </td>
            </tr>
        </table>
    </div><br>
    <div align="center">
        <input type="button" value="検索" onclick="return PushSearchButton()">
    </div><br>
    <div align="center">
        <input type="button" value="メニューに戻る" onclick="document.inform.BUTTON_ID.value='後から決める1'; document.inform.submit()">
    </div>
</form>
</body>
</html>
