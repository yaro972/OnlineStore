package com.travauxpratiques.firstapp.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SommeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");

        int somme = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("La somme des 2 nombres fournis est " + somme);
        out.print("</body></html>");
    }
}
