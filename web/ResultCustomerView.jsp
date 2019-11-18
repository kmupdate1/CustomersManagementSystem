<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 2019/11/19
  Time: 2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>お客様情報の検索結果</title>
</head>
<body>
<form action="ここ後で直す" method="post">
    <input type="hidden" name="BUTTON_ID" value="BOTTUNID">
    <div align="center" >
        <table>
            <tr>
                <td nowrap align="left" width="100">お客様ID</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersId}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">お客様名</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersName}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">年齢（任意）</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersAge}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">誕生日（任意）</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersBirthday}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">郵便番号</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersZip}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">住所</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersAddress}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">電話番号（任意）</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersPhone}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">お客様情報登録日時</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersCreatedAt}" />
                </td>
            </tr>
            <tr>
                <td nowrap align="left" width="100">お客様情報更新日時</td>
                <td nowrap align="left" width="300">
                    <c:out value="${requestScope.customer.customersUpdateAt}" />
                </td>
            </tr>
        </table>
    </div><br><br>
    <div align="center">
        <input type="submit" value="全画面に戻る">
    </div>
</form>
</body>
</html>
