package com.fsk.egitim.generic.genericclasslar;

/**
 * --- GENERIC KAVRAMI ---
 * Java5 ile hayatımıza girdi.
 * Genellikle aynı işi yapan, fakat farklı türde parametreler alan sınıf veya methodlarda kullanılır.
 */

public class GenericSinif {
    public static void main(String[] args) {

        String[] isimler = {"Furkan", "Sahin", "Kulaksiz"};
        Integer[] sayilar = {34,45,30,24,50};
        Character[] harfler = {'a', 'b', 'c', 'd'};
        Long[] longSayilar = {10L, 12L, 14L, 8L};

        StringDiziYazdir.stringDiziYazdir(isimler);
        IntDiziYazdir.intDiziYazdir(sayilar);
        CharDiziYazdir.charDiziYazdir(harfler);

        GenericDiziYazdir g = new GenericDiziYazdir();
        g.yazdir(isimler);
        g.yazdir(sayilar);
        g.yazdir(harfler);

        //GenericDiziYazdir<String> g2 = new GenericDiziYazdir<>();
        //g2.yazdir(isimler);

        //GenericDiziYazdir<Char> g2 = new GenericDiziYazdir<>();
        //g2.yazdir(Character);


        /*

        Guvenli kod yazmamızı sağlıyor.
        ArrayList sehirler = new ArrayList();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");*/

        ;




    }
}
