package com.fsk.egitim.enumerations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Insan beyazit = new Insan("Beyazit", "Ozturk", "1234", 45, Gender.ERKEK);
        Insan acun = new Insan("Acun", "Ilicali", "1234", 45, Gender.ERKEK);
        Insan busra = new Insan("Busra", "Pekin", "1234", 45, Gender.KADIN);

        //System.out.println(busra.toString());

        ArrayList<Insan> insanList = new ArrayList<>();
        insanList.add(beyazit);
        insanList.add(acun);
        insanList.add(busra);

        for (Insan item: insanList) {
            if (item.getGender().equals(Gender.ERKEK)){
                System.out.println(item);
            }
        }

    }
}
