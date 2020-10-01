package org.example.madjid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class testclass {
    @Test
    void maakVasteEnTijdelijkeWerknemersAan() {

        VasteWerknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
        VasteWerknemer v2 = new VasteWerknemer(2, "Dave", 15);

        TijdelijkeWerknemer t1 = new TijdelijkeWerknemer(3, "Evan", 40, 250);
        TijdelijkeWerknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);

        System.out.println(v1.getNaam() + " verdient " + v1.getSalaris());
        System.out.println(t1.getNaam() + " verdient " + t1.getSalaris());
    }

    @Test
    void watVindtDeCompilerHierVan() {

        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
        Werknemer v2 = new VasteWerknemer(2, "Dave", 15);

        Werknemer t1 = new TijdelijkeWerknemer(3, "Evan", 40, 250);
        Werknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);

        System.out.println(v1.getNaam() + " verdient " + v1.getSalaris());
        System.out.println(t1.getNaam() + " verdient " + t1.getSalaris());
    }

    @Test
    void maakEenSalarisRapportageVoorVasteEnTijdelijkeWerknemers() {

        VasteWerknemer[] vasteWerknemers = maakAantalVasteWerknemersAan();
        printSalarisRapportageVasteWerknemers(vasteWerknemers);

        TijdelijkeWerknemer[] tijdelijkeWerknemers = maakAantalTijdelijkeWerknemersAan();
        printSalarisRapportageTijdelijkeWerknemers(tijdelijkeWerknemers);

    }


    private TijdelijkeWerknemer[] maakAantalTijdelijkeWerknemersAan() {
        TijdelijkeWerknemer t1 = new TijdelijkeWerknemer(3, "Evan", 40, 250);
        TijdelijkeWerknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);
        TijdelijkeWerknemer[] tijdelijkeWerknemers = {t1, t2};
        return tijdelijkeWerknemers;
    }

    private VasteWerknemer[] maakAantalVasteWerknemersAan() {
        VasteWerknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
        VasteWerknemer v2 = new VasteWerknemer(2, "Dave", 15);
        VasteWerknemer[] vasteWerknemers = {v1, v2};
        return vasteWerknemers;
    }

    private void printSalarisRapportageTijdelijkeWerknemers(TijdelijkeWerknemer[] tijdelijkeWerknemers) {
        for (TijdelijkeWerknemer tw : tijdelijkeWerknemers) {
            System.out.println("ID = " + tw.getId() + " naam = " + tw.getNaam() + " verdient " + tw.getSalaris());
        }
    }

    private void printSalarisRapportageVasteWerknemers(VasteWerknemer[] vasteWerknemers) {
        for (VasteWerknemer vw : vasteWerknemers) {
            System.out.println("ID = " + vw.getId() + " naam = " + vw.getNaam() + " verdient " + vw.getSalaris());
        }
    }

    @Test
    void maakEenSalarisRapportageVoorVasteEnTijdelijkeWerknemersSlimmerMetWerknemers() {

        Werknemer[] werknemers = maakAantalWerknemersAan();
        printSalarisRapportageWerknemers(werknemers);

    }

    private void printSalarisRapportageWerknemers(Werknemer[] werknemers) {
        for (Werknemer w : werknemers) {
            System.out.println("ID = " + w.getId() + " naam = " + w.getNaam() + " verdient " + w.getSalaris());
        }
    }
    private Werknemer[] maakAantalWerknemersAan() {
        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
        Werknemer v2 = new VasteWerknemer(2, "Dave", 15);
        Werknemer t1 = new TijdelijkeWerknemer(3, "Evan", 40, 250);
        Werknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);
        Werknemer[] werknemers = {v1, v2,t1,t2};
        return werknemers;
    }

    @Test
    void hoeZitHetMetDeWerknemerKlasse() {
        //Niet meer mogelijk wanneer Werknemer klass abstract is
//        Werknemer jo = new Werknemer(1, "Jo");
//        System.out.println(jo.getSalaris());
    }

    @Test
    void allesIsEenObject() {
        String s = "een Stringetje";
        Object [] objects = { new Object(), new VasteWerknemer(1,"Jo",20), s};
        for(Object object : objects){
            System.out.println(object.toString());
        }
    }

    @Test
    void zijnDezeVWGelijk() {
        VasteWerknemer vw1 = new VasteWerknemer(1, "Jo", 10);
        VasteWerknemer vw2 = new VasteWerknemer(1, "Jo", 10);

        //Hier vergelijk je geen inhoud maar adressen
        if(vw1 == vw2){
            System.out.println("Gelijke adressen");
        }else{
            System.out.println("Ongelijk adressen");
        }

        if(vw1.equals(vw2)){
            System.out.println("Gelijke inhoud");
        }else{
            System.out.println("Ongelijke inhoud");
        }
    }
    @Test
    void eenAantalWerknemersSorterenOpSalaris() {

        WerkneemBaar[] werkneemBaren = getWerkneemBaren();

        printWerkneembaren(werkneemBaren);



        Comparable comparable;


        Arrays.sort(werkneemBaren);



        printWerkneembaren(werkneemBaren);
    }

    @Test
    void eenAantalWerknemersSorterenOpSalarisCompareTo() {

        WerkneemBaar[] werkneemBaren = getWerkneemBaren();



        Comparable comparable;


        Arrays.sort(werkneemBaren);



    }
    private WerkneemBaar[] getWerkneemBaren() {
        Werknemer v1 = new VasteWerknemer(3, "Sjoerd", 12);
        Werknemer v2 = new VasteWerknemer(2, "Dave", 15);
        Werknemer t1 = new TijdelijkeWerknemer(1, "Evan", 40, 250);
        Werknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);

        return new WerkneemBaar[]{v1, v2, t1, t2};
    }

    private void printWerkneembaren(WerkneemBaar[] werkneemBaren) {
        for (WerkneemBaar w : werkneemBaren) {
            System.out.println(w.getNaam() + " verdient " + w.getNaam());
            System.out.println(w.getNaam().compareTo("Sjoerd"));
        }



    }







}
