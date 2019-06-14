package com.travauxpratiques.firstapp.resources;

import javax.ws.rs.Path;

@Path("/calculation")
public class CalculationResource {
    public void sommeEtProduit() {
        /*int sommeNumerique = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);
        int produitNumerique = Integer.parseInt(nombre1) * Integer.parseInt(nombre2);

        response.setContentType("application/json");
        ObjectMapper objectMapper = new ObjectMapper();


        SommeEtProduit sommeEtProduit = new SommeEtProduit();
        Somme somme = new Somme();
        somme.setNumerique(sommeNumerique);
        somme.setTexte("trente-six");

        Produit produit = new Produit();
        produit.setNumerique(produitNumerique);
        produit.setTexte("quarante-deux");

        sommeEtProduit.setSomme(somme);
        sommeEtProduit.setProduit(produit);
        objectMapper.writeValue(out, sommeEtProduit);*/
    }
}
