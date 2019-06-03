package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        HttpSession session = req.getSession();
        String loginName = (String) session.getAttribute("loginName");

        resp.addHeader("charset", "utf-8");
        try (PrintWriter out = resp.getWriter()) {
            out.print("<html>");
            out.print("<head>");
            out.print("<meta charset=\"UTF-8\" /> ");
            out.print("</head>");
            out.print("<body>");
            if (loginName == null || loginName.isEmpty()) {
                out.print("Bonjour, veuillez-vous identifier ");
                out.print("<a href=\"login.html\">ici</a>");

                resp.sendRedirect("login.html");
            } else {
                out.print("<p>Bonjour " + loginName);
                out.print(" (<a href=\"logout\">Déconnexion</a>)</p>");
                out.print("<h1>OnlineStore-Gestion de la boutique</h1> ");
                out.print("<div><a href=\"add-work-form.html \">Ajouter une œuvre au catalogue</a></div>");
                out.print("<div><a href=\"catalogue\">Accès au catalogue des oeuvres</a></div> ");
                out.print("<div><a href=\"/frontoffice/home\">Vers FrontOffice</a></div>  ");
            }
            out.print("</body>");
            out.print("</html>");


//            out.print("<html><body>" +
//                    "Bonjour " + loginName +
//                    "<h1>OnlineStore-Gestion de la boutique</h1> " +
//                    "<div><a href=\"add-work-form.html \">Ajouter une œuvre au catalogue</a></div>" +
//                    "<div><a href=\"catalogue\">Accès au catalogue des oeuvres</a></div>" +
//                    "<div><a href=\"/frontoffice/home\">Vers FrontOffice</a></div> " +
//                    "</body></html>");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

