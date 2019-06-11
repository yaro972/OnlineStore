<%--
  Created by IntelliJ IDEA.
  User: thierry.aronoff
  Date: 11/06/19
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online Store - Accueil Backoffice </title>
</head>
<body>
<%
    String loginName = (String) session.getAttribute("loginName");
    if (loginName == null || loginName.isEmpty()) { %>
<div>
    <p>Veuillez vous identifier</p>
    <a href="login.html">ici</a>
</div>
<%
} else {
%>
<p>Bonjour <%=loginName%>
    <a href="logout">Déconnexion</a></p>
<h1>OnlineStore-Gestion de la boutique</h1>
<div><a href="add-work-form.html ">Ajouter une œuvre au catalogue</a></div>
<div><a href="catalogue.jsp">Accès au catalogue des oeuvres</a></div>
<div><a href="frontoffice/home.jsp">Vers FrontOffice</a></div>
<%
    }%>

</body>
</html>
