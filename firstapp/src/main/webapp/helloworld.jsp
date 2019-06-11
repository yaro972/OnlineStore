<%@ page import="com.travauxpratiques.firstappcore.Personne" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.persistence.criteria.CriteriaBuilder" %><%--
  Created by IntelliJ IDEA.
  User: Yaro
  Date: 08/06/2019
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<h1>Hello World!</h1>


<%
    Personne michelDupont = new Personne("Michel", "Dupont");

%>

<p>Bonjour <%=michelDupont.getFullName()%>
</p>

</body>
</html>
