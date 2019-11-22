<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 2019/11/20
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>エラー表示</title>
</head>
<body>
    <div align="center" style="color: red">
        <p>
            <c:out value="${requestScope.message}"/><br><br>
        </p>
    </div>

    <form action="/FrontControllerServlet" method="post">
        <input type="hidden" name="BUTTON_ID" value="">
        <div align="center">
            <input type="button" value="ログイン画面へ"
                   onclick="this.form.BUTTON_ID.value = '901_01_01' ; this.form.submit() ;"><br>
        </div>
    </form>
</body>
</html>
