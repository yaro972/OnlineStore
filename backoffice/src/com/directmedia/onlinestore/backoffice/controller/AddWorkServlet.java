package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddWorkServlet", urlPatterns = "/add-work")
public class AddWorkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String release = request.getParameter("release");
        String genre = request.getParameter("genre");
        String summary = request.getParameter("summary");
        String mainArtist = request.getParameter("main-artist");


        Artist newArtist = new Artist(mainArtist);
        Work newWork = new Work(title);

        newWork.setGenre(genre);
        newWork.setSummary(summary);
        newWork.setMainArtist(newArtist);

        if (!release.isEmpty()) {

            newWork.setRelease(Integer.parseInt(release));
        }

//        Work.LastId++;

//        newWork.setId(Work.LastId);

        Catalogue.listOfWorks.add(newWork);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("<p>Le film a été ajouté</p><a href=\"/backoffice/home\">Retour a la page d'accueil</a>");
        out.print("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
