package com.travauxpratiques.firstapp.controller;


import com.travauxpratiques.firstappcore.Livre;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SelectionLivreServlet", urlPatterns = {"/selection-du-livre"})
public class SelectionLivreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        String numeroSession = session.getId();

        String identifiantLivre = req.getParameter("id");

        List<Livre> liste = (List<Livre>) session.getAttribute("listelivres");

        if (liste == null) {
            liste = new ArrayList<Livre>();
            session.setAttribute("listelivres", liste);
        }

        Livre livre = new Livre();
        livre.setNumeroLivre(Integer.parseInt(identifiantLivre));

        liste.add(livre);

        session.setAttribute("listelivre", liste);

        PrintWriter out = resp.getWriter();

        out.println("<HTML><BODY>");
        out.print("Merci d'avoir choisi le livre " + identifiantLivre + "<br />");
        // out.print("Votre numéro de session est  " + numeroSession + "<br />");
        out.print("<a href=\"choix-du-livre.html\">Cliquez ici pour ajouter un autre livre</a><br/> ");
        out.print("<a href=\"payer-livre.html\">Cliquez ici pour payer</a> ");
        out.println("</BODY></HTML>");
    }
}
