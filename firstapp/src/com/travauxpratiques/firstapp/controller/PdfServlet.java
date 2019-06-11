package com.travauxpratiques.firstapp.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PdfServlet", urlPatterns = {"/pdf"})
public class PdfServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        resp.setContentType("application/pdf");
        try {

            Document document = new Document();
            PdfWriter.getInstance(document, resp.getOutputStream());

            document.open();
            Integer somme = (Integer) req.getAttribute("somme");
            String message;

            if (somme != null) message = "La somme des deux nombres est " + somme;
            else message = "Hello World";

            document.add(new Paragraph(message));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
