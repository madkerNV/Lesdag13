package org.example.madjid;

public class TijdelijkeWerknemer extends Werknemer implements Comparable{

    private int aantalUren;
    private int uurloon;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurloon) {
        super(id, naam);
        setAantalUren(aantalUren);
        setUurloon(uurloon);
    }


    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public int getAantalUren() {
        return aantalUren;
    }

    public void setUurloon(int uurloon) {
        this.uurloon = uurloon;
    }

    public int getUurloon() {
        return uurloon;
    }

    public String toString(){
        return "Tijdelijke"  + super.toString() +  " en uurloon = " + uurloon+ "]";
    }

    public int getSalaris(){
        return aantalUren*uurloon;
    }

    public boolean equals(Object otherObject){
        if(otherObject == null) return false;
        if( !(otherObject instanceof TijdelijkeWerknemer)) return false;
        TijdelijkeWerknemer otherTijdelijkeWerknemer = (TijdelijkeWerknemer)otherObject;
        return this.getId() == otherTijdelijkeWerknemer.getId() ;
    }

    @Override
    public int compareTo(Object otherObject) {
        WerkneemBaar otherWerkneembaar = (WerkneemBaar) otherObject;

        return this.getNaam().compareTo(otherWerkneembaar.getNaam());
    }
}
