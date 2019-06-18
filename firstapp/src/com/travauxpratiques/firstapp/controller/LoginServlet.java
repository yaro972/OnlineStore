package com.travauxpratiques.firstapp.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        try (PrintWriter out = response.getWriter()) {
            out.print("<HTML><BODY>Vous vous êtes identifié avec succès avec les identifiants "+ login +" /"+ password +"</BODY></HTML>");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
