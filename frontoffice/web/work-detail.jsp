<%--
  Created by IntelliJ IDEA.
  User: thierry.aronoff
  Date: 12/06/19
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OnlineStore - Détail de l'oeuvre</title>
</head>
<body>

<h1>Detail de l'oeuvre ${requestScope.work.title}</h1>
<section>
    <div>
        Artiste : ${requestScope.work.mainArtist.name} <br/>
        Année de parution : ${requestScope.work.release}<br/>
        Genre : ${requestScope.work.genre} <br/>
        Résumé : ${requestScope.work.summary}
    </div>
</section>

<section>
    <form method="POST" action="addToCard">
        <input type="hidden" name="identifiant" value="${requestScope.work.id}"/>
        <button type="submit" name="button">Ajouter au caddie</button>
    </form>
</section>
</body>
</html>
