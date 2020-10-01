package org.example.madjid;

public class VasteWerknemer extends Werknemer implements Comparable{
    private int salarisSchaal;

    public VasteWerknemer(int id, String naam, int salarisSchaal) {
        super(id,naam);
        setSalarisSchaal(salarisSchaal);
    }



    public void setSalarisSchaal(int salarisSchaal) {
        this.salarisSchaal = salarisSchaal;
    }

    public int getSalarisSchaal() {
        return salarisSchaal;
    }

    public String toString(){
        return "Vaste" + super.toString() + " en salarisSchaal = " + salarisSchaal+ "]";
    }

    public int getSalaris(){
        return salarisSchaal* 1000;
    }
    public boolean equals(Object otherObject){
        if(otherObject == null) {
            return false;
        }
        else if( !(otherObject instanceof VasteWerknemer)){ return false;}
        VasteWerknemer otherVasteWerknemer = (VasteWerknemer) otherObject;
        return otherVasteWerknemer.getId() == this.getId();
    }

    @Override
    public int compareTo(Object otherObject) {
        WerkneemBaar otherWerkneembaar = (WerkneemBaar) otherObject;
        return this.getNaam().compareTo(otherWerkneembaar.getNaam());
    }
}
