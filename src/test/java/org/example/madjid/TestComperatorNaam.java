package org.example.madjid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestComperatorNaam {

    @Test
    void eenAantalWerknemersSorterenOpNaamDusAlfabetischeVolgorde() {

        WerkneemBaar[] werkneemBaren = getWerkneemBaren();
        System.out.println("ControleGroep:");
        printWerkneembaren(werkneemBaren);


        Arrays.sort(werkneemBaren, new WerknemerNaamComparator()); // Belangrijke regel onderscheid wordt hier gedefinieerd

        System.out.println("TestGroep:");
        printWerkneembaren(werkneemBaren);
    }

    private WerkneemBaar[] getWerkneemBaren() {
        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
        Werknemer v2 = new VasteWerknemer(3, "Dave", 15);
        Werknemer t1 = new TijdelijkeWerknemer(2, "Evan", 40, 250);
        Werknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);

        return new WerkneemBaar[]{v1, v2, t1, t2};
    }

    private void printWerkneembaren(WerkneemBaar[] werkneemBaren) {
        for (WerkneemBaar w : werkneemBaren) {
            System.out.println(w.getNaam() + " met id " + w.getId() + " verdient " + w.getSalaris());
        }
    }

}
