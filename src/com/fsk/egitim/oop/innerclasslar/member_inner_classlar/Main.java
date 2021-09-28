package com.fsk.egitim.oop.innerclasslar.member_inner_classlar;

public class Main {
    public static void main(String[] args) {
        String[] sehirler = {"Ankara", "Istanbul", "Bursa"};
        GenelClass.DiziYazdir nesne = new GenelClass().new DiziYazdir();
        nesne.diziYazdir(sehirler);
    }

}
