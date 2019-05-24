package com.travauxpratiques.firstapp.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SelectionLivreServlet", urlPatterns = {"/selection-du-livre"})
public class SelectionLivreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String numeroSession = session.getId();

        String identifiantLivre = req.getParameter("id");

        PrintWriter out = resp.getWriter();

        session.setAttribute("identifiantLivre", identifiantLivre);

        out.println("<HTML><BODY>");
        out.print("Merci d'avoir choisi le livre " + identifiantLivre + "<br />");
        out.print("Votre numéro de session est  " + numeroSession + "<br />");
        out.print("<a href=\"payer-livre.html\">Cliquez ici pour payer</a> ");
        out.println("</BODY></HTML>");
    }
}
