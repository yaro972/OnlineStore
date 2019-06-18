/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travauxpratiques.firstapp.resources;

import com.travauxpratiques.firstappcore.Livre;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jnesis
 */
@Path("/livre")
public class LivreResource {

    private static List<Livre> catalogue = new ArrayList<>();

    static {
        Livre livre1 = new Livre();
        livre1.setNumeroLivre(1);
        livre1.setNom("Les miséroïdes");
        Livre livre2 = new Livre();
        livre2.setNumeroLivre(2);
        livre2.setNom("Duel");
        catalogue.add(livre1);
        catalogue.add(livre2);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Livre> liste() {
        return catalogue;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{numero}")
    public Livre get(@PathParam("numero") int numero) {

        return catalogue.stream()
                .filter(livre -> livre.getNumeroLivre() == numero)
                .findFirst()
                .orElse(null);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Livre newLivre) {
        System.out.println(newLivre);
        Livre livre = new Livre();
        livre.setNumeroLivre(catalogue.size() + 1);
        livre.setNom(newLivre.getNom());
        catalogue.add(livre);
        return Response.status(Response.Status.CREATED).entity(livre.getNumeroLivre()).build();
    }

    @DELETE
    @Path("/{numero}")
    public Response delete(@PathParam("numero") int numero) {
        catalogue.removeIf(livre -> livre.getNumeroLivre() == numero);
        return Response.status(Response.Status.OK).build();
    }

    @PUT
    @Path("/{numero}")
    public Response modify(@PathParam("numero") int numero, @QueryParam("nom") String nom) {
        Livre livreAModifier = catalogue.stream()
                .filter(livre -> livre.getNumeroLivre() == numero)
                .findFirst()
                .orElse(null);
        assert livreAModifier != null;
        livreAModifier.setNom(nom);
        return Response.status(Response.Status.OK).build();
    }
}
