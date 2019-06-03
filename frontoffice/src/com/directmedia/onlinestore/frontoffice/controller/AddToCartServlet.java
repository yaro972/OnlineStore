package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.ShoppingCart;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet(name = "AddToCartServlet", urlPatterns = {"/addToCard"})
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String id = request.getParameter("identifiant");
        Long longId = Long.parseLong(id);

        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");


        if (cart == null) {
            cart = new ShoppingCart();
        }

        Optional<Work> optionalWork = Catalogue.listOfWorks.stream().filter(work -> work.getId() == longId).findAny();
        if (optionalWork.isPresent()) {

            cart.Item.add(optionalWork.get());
        }


        session.setAttribute("cart", cart);


        response.setContentType("text/html, UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.print("<html>");
            out.print("<body>");
            out.print("Votre panier d'achat(" + cart.Item.size() + ")");
            out.print("<a href=\"home\"> Retour à l'accueil</a>");
            out.print("</body>");
            out.print("</html>");
        } catch (Exception e) {
            System.out.println("Error exception" + e.getMessage());
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
