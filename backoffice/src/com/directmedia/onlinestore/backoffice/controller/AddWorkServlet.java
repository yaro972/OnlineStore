package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "AddWorkServlet", urlPatterns = "/add-work")
public class AddWorkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean success = true;
        String title = request.getParameter("title");
        String release = request.getParameter("release");
        String genre = request.getParameter("genre");
        String summary = request.getParameter("summary");
        String mainArtist = request.getParameter("mainArtist");


        Artist newArtist = new Artist(mainArtist);
        Work newWork = new Work(title);

        newWork.setGenre(genre);
        newWork.setSummary(summary);
        newWork.setMainArtist(newArtist);
        long identifiantOeuvre = newWork.getId();

        try {
            if (!release.isEmpty()) {

                newWork.setRelease(Integer.parseInt(release));
            }

//        Work.LastId++;

//        newWork.setId(Work.LastId);

        } catch (NumberFormatException nfe) {
            success = false;

        }

        Optional<Work> optionalWork =
                Catalogue.listOfWorks.stream().filter(work -> work.getTitle().equals(newWork.getTitle()) && work.getRelease() == newWork.getRelease() && work.getMainArtist().getName().equals(newWork.getMainArtist().getName())).findAny();
        if (optionalWork.isPresent()) {

            success = false;
        }

        RequestDispatcher disp = null;
        if (success) {
            Catalogue.listOfWorks.add(newWork);
            request.setAttribute("identifiantOeuvre", identifiantOeuvre);
            disp = request.getRequestDispatcher("/work-added-success");

        } else {
            disp = request.getRequestDispatcher("/work-added-failure");
        }
        disp.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
