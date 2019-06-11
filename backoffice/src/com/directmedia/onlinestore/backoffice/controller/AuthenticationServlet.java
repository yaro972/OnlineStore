package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@WebServlet(name = "AuthenticationServlet", urlPatterns = {"/login"})
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

        String login = request.getParameter("login");
        String password = request.getParameter("password");


        try (PrintWriter out = response.getWriter()) {
            out.print("<html><body>");

            if (("123456".equals(password) && "michel".equals(login)) || ("abcdef".equals(password) && "caroline".equals(login))) {
                HttpSession session = request.getSession();
                session.setAttribute("loginName", login);

                out.print("<div>Identification réussie</p></div><div><a href=\"home.jsp\">Accès à la page " +
                        "d'accueil</a></div>");
            } else {
                out.print("<div>Login ou mot de passe erroné</p></div><div><a href=\"login.html\">Nouvelle tentative</a></div>");
            }
            out.print("</body></html>");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
