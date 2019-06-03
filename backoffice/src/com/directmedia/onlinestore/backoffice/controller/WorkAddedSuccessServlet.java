package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WorkAddedSuccessServlet", urlPatterns = {"/work-added-success"})
public class WorkAddedSuccessServlet extends HttpServlet {
    /*
    / Une servlet WorkAddedSuccessServlet  qui affiche une confirmation
    (“L’œuvre à bien été ajoutée”).
    Suivi d’un lien pour retourner au catalogue.
     */

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Oeuvre ajoutee</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div>");
        out.print("<h1>L\'oeuvre a bien ete ajoutee</h1>");
        out.print("<a href=\"catalogue\">retourner au catalogue</a> ");
        out.print("</div>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
