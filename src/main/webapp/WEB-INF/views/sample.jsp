<%--
  Created by IntelliJ IDEA.
  User: Java
  Date: 2017/03/07
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/css/style.css" />" rel="stylesheet">
    <title>Sample</title>
</head>
<body>
    <h1>
        ${ID}
    </h1>

    <p>
        ${msg} <br>
        ${data}
    </p>
</body>
</html>
