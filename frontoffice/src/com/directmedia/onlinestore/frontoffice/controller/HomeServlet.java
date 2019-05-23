package com.directmedia.onlinestore.frontoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        try (PrintWriter out = resp.getWriter()) {
            out.print("<html>");
            out.print("<body><h1>OnlineStore, Votre boutique multimédia en ligne</h1>");
            out.print("<div><a href=\"catalogue\">Accès au catalogue des oeuvres</a>  </div>");
            out.print("<div><a href=\"/backoffice/home\">Vers backoffice</a></div></body></html>");
            out.print("</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
