package com.travauxpratiques.firstapp.controller;


import com.travauxpratiques.firstappcore.Personne;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Personne michelDupont = new Personne("Michel", "Dupont");

        response.setContentType("text/html; charset=UTF-8");


        try (PrintWriter out = response.getWriter()) {
            out.print("<html><body><p>Bonjour " + michelDupont.getFullName() + " </p> </body></html>");
        }
    }
}
