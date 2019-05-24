package com.travauxpratiques.firstapp.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PayerLivreServlet", urlPatterns = {"/payer-livre"})
public class PayerLivreServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String numeroSession = session.getId();
        String numeroCarte = req.getParameter("cardNumber");
        String identifiantLivre = (String) session.getAttribute("identifiantLivre");

        PrintWriter out = resp.getWriter();

        out.print("<html><body>");
        out.print("Paiement effectué avec le numéro de carte " + numeroCarte + "<br />");
        out.print("Le livre payé est le livre numéro  " + identifiantLivre + "<br />");
        out.print("Votre numéro de session est  " + numeroSession + "<br />");
        out.print("</body></html>");
    }
}
