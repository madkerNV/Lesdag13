package org.example.madjid;

import java.util.Comparator;

public class WerknemerIdComparator implements Comparator {

    @Override
    public int compare(Object object1, Object object2) {
        Werknemer w1 = (Werknemer) object1;
        Werknemer w2 = (Werknemer) object2;
        return w1.getId() - w2.getId(); //Belangrijke regel
    }
}
