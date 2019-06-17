<%--
  Created by IntelliJ IDEA.
  User: thierry.aronoff
  Date: 11/06/19
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr-fr">
<head>
    <title>Online Store - Accueil Backoffice </title>
    <link href="style.css" type="text/css"/>
    <script src="js/jquery-3.4.1.min.js" async></script>
    <script src="js/application.js" async></script>
    <meta charset="UTF-8">
</head>
<body>

<c:if test="${ empty sessionScope.loginName}">
    <div>
        <p>Veuillez vous identifier</p>
        <a href="login.html">ici</a>
    </div>
</c:if>

<c:if test="${not empty sessionScope.loginName}">
    <h1>OnlineStore-Gestion de la boutique</h1>
    <div>
        <section>
            <p>
                Bonjour ${sessionScope.loginName}
                <a href="logout">Déconnexion</a>
            </p>
        </section>

        <section>
            <div><a href="add-work-form.html ">Ajouter une œuvre au catalogue</a></div>
            <div><a href="catalogue">Afficher le catalogue</a></div>
            <div><a href="/frontoffice/home.jsp">Vers FrontOffice</a></div>
        </section>
    </div>
</c:if>


</body>
</html>
