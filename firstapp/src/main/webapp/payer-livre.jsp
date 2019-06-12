<%--
  Created by IntelliJ IDEA.
  User: thierry.aronoff
  Date: 12/06/19
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Livre payé</title>
</head>
<body>

<p>Paiement effectué avec le numéro de carte <%=request.getParameter("cardNumber")%>
</p>
<section>
    <p>Liste des livres payés :</p>
    <c:forEach items="${listelivres}" var="livre">
        <p>Liste des livres payés : ${livre.numeroLivre}</p>
    </c:forEach>
</section>


</body>
</html>
