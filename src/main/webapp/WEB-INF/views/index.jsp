<%--
  Created by IntelliJ IDEA.
  User: Java
  Date: 2017/03/01
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/css/style.css" />" rel="stylesheet">
    <title>HOME</title>
</head>
<body>
    <h1>
        こんにちは
    </h1>
    <p>
        ${msg1} <br>
        ${msg2}
    </p>


    <p>
        Introduction<br>
        <a href="<c:url value="/query?userId=100" />">QueryString</a>
    </p>
</body>
</html>
