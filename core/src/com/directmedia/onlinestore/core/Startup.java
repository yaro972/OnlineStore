package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {

    public static void main(String[] args) {
        Artist tomCruise = new Artist("Tom Cruise");
        Artist michaelJackson = new Artist("Michael Jackson");
        Artist louisDeFunes = new Artist("Louis De Funes");

        Work minorityReport = new Work("Minority Report");
        Work bad = new Work("Bad");
        Work leGendarmeDeSaintTropez = new Work("Le Gendarme de Saint-Tropez");


        minorityReport.setMainArtist(tomCruise);
        bad.setMainArtist(michaelJackson);
        leGendarmeDeSaintTropez.setMainArtist(louisDeFunes);

        minorityReport.setRelease(2002);
        bad.setRelease(1987);
        leGendarmeDeSaintTropez.setRelease(1964);

        minorityReport.setSummary("En 2054, la ville de Washington a réussi à éradiquer la criminalité. Grâce aux visions du futur fournies par trois individus exceptionnels doués de précognition (appelés précogs), les agents de Précrime peuvent arrêter les criminels juste avant qu’ils ne commettent leurs méfaits. Mais un jour, le chef de l'unité John Anderton reçoit des précogs une vision le concernant : dans moins de 36 heures, il aura assassiné un homme qu’il ne connaît pas encore et pour une raison qu’il ignore. Choqué, il prend la fuite, poursuivi par ses coéquipiers qui ont pour mission de l’arrêter conformément au système. ");
        bad.setSummary("Bad est le septième album solo de Michael Jackson et son 3e album solo chez Epic/CBS (Devenue Sony Music) et le 3e et dernier album co-produit par Quincy Jones. C'est l'un des albums les plus vendus de l'histoire et celui qui contient le plus de morceaux classés no 1 dans les palmarès. ");
        leGendarmeDeSaintTropez.setSummary("le film raconte les aventures de Ludovic Cruchot, un gendarme très « service-service », muté dans la cité balnéaire de Saint-Tropez, sur la côte d'Azur, avec le grade de maréchal des logis-chef. Il y découvre une brigade où il fait bon vivre et participe aux récurrentes chasses aux nudistes et aux nombreuses activités détente de sa brigade, dirigée par le quelque peu dépassé adjudant Gerber. ");


        minorityReport.setGenre("Science Fiction");
        bad.setGenre("Pop Musique");
        leGendarmeDeSaintTropez.setGenre("Comédie");

        Catalogue.listOfWorks.add(minorityReport);
        Catalogue.listOfWorks.add(bad);
        Catalogue.listOfWorks.add(leGendarmeDeSaintTropez);

        for (Work work : Catalogue.listOfWorks) {
            System.out.println(work.getTitle() + " (" + work.getRelease() + ")");
        }

    }
}
