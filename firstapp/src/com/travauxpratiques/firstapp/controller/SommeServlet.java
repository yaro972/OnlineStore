package com.travauxpratiques.firstapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.travauxpratiques.firstappcore.Produit;
import com.travauxpratiques.firstappcore.Somme;
import com.travauxpratiques.firstappcore.SommeEtProduit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SommeServlet", urlPatterns = {"/somme"})
public class SommeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");


        RequestDispatcher disp = null;
        try {
            int sommeNumerique = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);
            int produitNumerique = Integer.parseInt(nombre1) * Integer.parseInt(nombre2);

            String format = request.getParameter("format");

            if (format != null && format.equals("pdf")) {
                request.setAttribute("somme", sommeNumerique);
                disp = request.getRequestDispatcher("/pdf");
                disp.forward(request, response);
            } else {

                response.setContentType("application/json");
                ObjectMapper objectMapper = new ObjectMapper();
                PrintWriter out = response.getWriter();

                SommeEtProduit sommeEtProduit = new SommeEtProduit();
                Somme somme = new Somme();
                somme.setNumerique(sommeNumerique);
                somme.setTexte("trente-six");

                Produit produit = new Produit();
                produit.setNumerique(produitNumerique);
                produit.setTexte("quarante-deux");

                sommeEtProduit.setSomme(somme);
                sommeEtProduit.setProduit(produit);
                objectMapper.writeValue(out, sommeEtProduit);

            }
        } catch (NumberFormatException nfe) {
            disp = request.getRequestDispatcher("/unexpected-error");
            disp.forward(request, response);
        }
    }
}
