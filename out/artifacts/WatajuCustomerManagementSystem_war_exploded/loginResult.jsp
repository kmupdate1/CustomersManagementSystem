<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 2019/11/19
  Time: 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ログイン結果</title>
</head>
<body>
    <h1><c:out value="${sessionScope.users.usersName}" />さんがログイン中</h1>
</body>
</html>
