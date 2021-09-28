package com.fsk.egitim.oop.innerclasslar.member_inner_classlar.ornek;

public class Main {

    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();
        HesapMakinesi.Topla topla = hm.new Topla();
        int toplam = topla.toplama(7,9);
        System.out.println("Toplama Sonucu = " + toplam);

        HesapMakinesi.Cikarma cikarma = hm.new Cikarma();
        int cikarmaSonucu = cikarma.cikarma(12, 10);
        System.out.println("Cikarma Sonucu = " + cikarmaSonucu);

        int carpmaSonucu = hm.carp(7,6);
        System.out.println("Carpma Sonucu = " + carpmaSonucu);


        //Local Inner Classlar
        hm.kisiTanit();
    }
}
