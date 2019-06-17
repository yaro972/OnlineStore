package com.travauxpratiques.firstapp.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.travauxpratiques.firstappcore.Produit;
import com.travauxpratiques.firstappcore.Somme;
import com.travauxpratiques.firstappcore.SommeEtProduit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculation")
public class CalculationResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/somme-et-produit")
    public SommeEtProduit sommeEtProduit(@QueryParam("nombre1") int nombre1, @QueryParam("nombre2") int nombre2) {
        ObjectMapper objectMapper = new ObjectMapper();
        int sommeNumerique = nombre1 + nombre2;
        int produitNumerique = nombre1 * nombre2;

        Somme somme = new Somme();
        SommeEtProduit sommeEtProduit = new SommeEtProduit();
        somme.setNumerique(sommeNumerique);
        somme.setTexte("trente-six");

        Produit produit = new Produit();
        produit.setNumerique(produitNumerique);
        produit.setTexte("quarante-deux");

        sommeEtProduit.setSomme(somme);
        sommeEtProduit.setProduit(produit);

        return sommeEtProduit;
    }
}
