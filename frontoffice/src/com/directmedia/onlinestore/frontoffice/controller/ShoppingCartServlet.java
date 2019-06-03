package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet(name = "ShoppingCartServlet", urlPatterns = {"/shopping-cart"})
public class ShoppingCartServlet extends HttpServlet {
    /*
Ce caddie sera matérialisé par une nouvelle classe ShoppingCartServlet située dans les sources du module core au côté
des autres entités de l'application.

Cette classe disposera d'un attribut items de type Set<Work> .
* Cette collection sera composée des œuvres que le client du front-office souhaite acquérir.

A partir de la fiche descriptive du film qui se trouve dans le front-office, proposez un formulaire qui sera constitué
d'un bouton "Ajouter au caddie" et d'un seul champ invisible reprenant l'identifiant de l’œuvre en valeur :


<input type="hidden" name="identifiant" value="identifiant de l'oeuvre"/>

Le formulaire sera soumis à une servlet d’ajout AddToCartServlet et sera disponible sous l’URL /addToCart.

Cette servlet va :

recevoir l'identifiant de l’œuvre souhaitée
rechercher dans le catalogue l’œuvre
si c'est la première fois que l'utilisateur sélectionne un film dans sa session de navigation
instancie un caddie et le dépose en session utilisateur
si ce n'est pas la première fois, récupère le caddie présent en session utilisateur
ajoute l’œuvre au caddie
La servlet retournera enfin un contenu HTML permettant d'afficher :

le texte de confirmation « Œuvre ajoutée au caddie (X) » où X sera le nombre d’œuvre que comporte désormais le caddie
Un lien permettant de retourner au catalogue.
     */
    private Set<Work> items;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("text/html");
        HttpSession session = request.getSession();
        session.setAttribute("cartList", items);

        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<header>");
            out.println("<title>Shopping Cart</title>");
            out.println("</header>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void goPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
