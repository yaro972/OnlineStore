package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WorkAddedFailureServlet", urlPatterns = {"/work-added-failure"})
public class WorkAddedFailureServlet extends HttpServlet {
    /*
    Une servlet WorkAddedFailureServlet  qui affiche le message d'erreur
    (“Une erreur est survenue, l’œuvre n’a pas été ajoutée”).
    Suivi là aussi d’un lien pour retourner au catalogue
     */

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>servlet UnexpectedErrorServlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div>");
        out.print("<h1>Une erreur est survenue. L\'oeuvre n\'a pas été ajoutee.</h1>");
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
