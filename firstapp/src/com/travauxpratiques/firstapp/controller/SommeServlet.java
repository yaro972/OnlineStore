package com.travauxpratiques.firstapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SommeServlet", urlPatterns = {"/somme"})
public class SommeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");


        RequestDispatcher disp = null;
        try {
            int somme = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);

            String format = request.getParameter("format");

            request.setAttribute("somme", somme);
            if (format != null && format.equals("pdf")) {
                disp = request.getRequestDispatcher("/pdf");
                disp.forward(request, response);
            } else {
                disp = request.getRequestDispatcher("/affichage-somme.jsp");
                disp.forward(request, response);
            }
        } catch (NumberFormatException nfe) {
            disp = request.getRequestDispatcher("/unexpected-error");
            disp.forward(request, response);
        }
    }
}
