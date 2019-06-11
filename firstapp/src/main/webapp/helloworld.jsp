<%--
  Created by IntelliJ IDEA.
  User: Yaro
  Date: 08/06/2019
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<h1>Hello World!</h1>

<%
    // int nombre = 36;
    int nombre = Integer.parseInt(request.getParameter("nombre"));


    /*nombre++;*/

    if (nombre == 36) {

%>
<p>Ce code est affiché uniquement si nombre = <% out.print(nombre);%></p>
ou
<p>Ce code est affiché uniquement si nombre = <%=nombre%>
</p>
<%
} else {
%>
<p>Ce code est affiché car nombre = <%=nombre%>
</p>
<%

    }
%>

</body>
</html>
