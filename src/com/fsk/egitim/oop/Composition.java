package com.fsk.egitim.oop;

public class Composition {
    public static void main(String[] args) {
        Araba a = new Araba();
        a.durmayaBasla();
    }
}

class Motor {
    private String ureticiAdi;
    private int beygirGucu;

    public Motor () {
        ureticiAdi = "HONDA";
        beygirGucu = 250;
        System.out.println(ureticiAdi + " ureticili ve " + beygirGucu + " beygir guclu motor olusturuldu.");
    }

    public void calistir() {
        System.out.println("Motor calisti.");
    }

    public void durdur() {
        System.out.println("Motor Durdu.");
    }
}

class Araba {
    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;

    public Araba () {
        arabaMotoru = new Motor();
        renk = "Kirmizi";
        marka = "Toyota";
        uretimYili = 2021;
        System.out.println(renk + " renkli " + uretimYili + " model " + marka + " arac olusturuldu.");
    }

    public void hareketeGec() {
        System.out.println("Araba harekete geciyor.");
    }

    public void durmayaBasla() {
        System.out.println("Araba durmaya basladi.");
    }
}
