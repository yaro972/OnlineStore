package com.travauxpratiques.firstapp.controller;


import com.travauxpratiques.firstappcore.Personne;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    /**
     * @param request Request Object
     * @param response Response Object
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    /**
     * @param request Request Object
     * @param response Response Object
     * @throws IOException Error Exception
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Personne michelDupont = new Personne("Michel", "Dupont");

        response.setContentType("text/html; charset=UTF-8");


        try (PrintWriter out = response.getWriter()) {
            out.print("<html><body><p>Bonjour " + michelDupont.getFullName() + " </p> </body></html>");
        }
    }
}
