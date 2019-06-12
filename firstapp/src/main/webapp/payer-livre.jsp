<%--
  Created by IntelliJ IDEA.
  User: thierry.aronoff
  Date: 12/06/19
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Livre payé</title>
</head>
<body>

<p>Paiement effectué avec le numéro de carte <%=request.getParameter("cardNumber")%>
</p>
<p>Le livre payé est le livre numéro ${sessionScope.livre.numeroLivre}</p>

</body>
</html>
