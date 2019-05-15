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

        try (PrintWriter out = resp.getWriter()) {
            out.print("<html><body>" +
                    "Bonjour "+ loginName +
                    "<h1>OnlineStore-Gestion de la boutique</h1> " +
                    "<div><a href=\"http://localhost:8080/backoffice/add-work-form.html \">Ajouter une œuvre au catalogue</a></div>" +
                    "<div><a href=\"http://localhost:8080/backoffice/catalogue\">Accès au catalogue des oeuvres</a></div>" +
                    "<div><a href=\"http://localhost:8080/frontoffice/home\">Vers FrontOffice</a></div> " +
                    "</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

