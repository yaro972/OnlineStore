package com.travauxpratiques.firstapp.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UnexpectedErrorServlet", urlPatterns = {"/unexpected-error"})
public class UnexpectedErrorServlet extends HttpServlet {
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>servlet UnexpectedErrorServlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Unexpected Error - Operation Canceled (from Servlet)</h1>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        processRequest(request, response);


    }
}
