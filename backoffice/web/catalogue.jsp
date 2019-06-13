<%@ page import="com.directmedia.onlinestore.core.entity.Artist" %>
<%@ page import="com.directmedia.onlinestore.core.entity.Catalogue" %>
<%@ page import="com.directmedia.onlinestore.core.entity.Work" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: thierry.aronoff
  Date: 11/06/19
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online Store - Catalogue Backoffice</title>
</head>
<body>

<h1>Oeuvres au catalogue</h1>
<ul>
    <c:forEach items="${requestScope.listofworks}" var="work">

    <li>
            ${work.title} ( ${work.release} )
    </li>
    </c:forEach>

</ul>
</body>
</html>
