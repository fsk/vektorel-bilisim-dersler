package com.fsk.egitim.generic.genericmethodlar;

/**
 * Aşağıdaki bütün diziler aslında object den gelme.
 */
public class GenericMethodlar {
    public static void main(String[] args) {
        String[] isimler = {"Furkan", "Sahin", "Kulaksiz"};
        Integer[] sayilar = {34,45,30,24,50};
        Character[] harfler = {'a', 'b', 'c', 'd'};

        stringDiziYazdir(isimler);
        intDiziYazdir(sayilar);
        charDiziYazdir(harfler);

        System.out.println("-----------------------------------");

        //diziYazdir(isimler);
        //diziYazdir(sayilar);
        //diziYazdir(harfler);

        genericYazdir(isimler);
        genericYazdir(sayilar);
        genericYazdir(harfler);
    }

    // Bu method ile genel geçer ifadelerden bahsedebiliriz ama özel ifadelerden bahsedemeyiz.
    /*public static void diziYazdir(Object[] dizi) {
        for (Object gecici : dizi) {
            System.out.println(((String)gecici).contains("k"));
        }
    }*/


    public static <Genel> void genericYazdir(Genel[] dizi) {
        for (Genel gecici:
             dizi) {
            System.out.println(gecici);
        }
    }

    public static <Genel extends Number> void genericOzelYazdir(Genel[] dizi) {
        for (Genel gecici:
                dizi) {
            System.out.println(gecici);
        }
    }

    public static void stringDiziYazdir(String[] dizi){
        for (String item : dizi) {
            System.out.println(item);
        }
    }

    public static void intDiziYazdir(Integer[] dizi){
        for (Integer item : dizi) {
            System.out.println(item);
        }
    }

    public static void charDiziYazdir(Character[] dizi){
        for (Character item : dizi) {
            System.out.println(item);
        }
    }
}
