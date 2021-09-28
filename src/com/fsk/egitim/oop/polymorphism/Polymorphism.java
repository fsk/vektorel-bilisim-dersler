package com.fsk.egitim.oop.polymorphism;

/**
 * ---- POLYMORPHISM ----
 * Alt sınıfa ait bir nesne, üst sınıfa ait bir nesne olarak gösterilebilir.
 * Tanım olarak; Üst sınıf değişkeninin alt sınıf nesnelerini referans edebilmesidir.
 *
 * Hayvan h = new Kopek(); -> Her köpek bir hayvandır.
 * Kalem k = new PilotKalem(); -> Her pilot kalem bir kalemdir.
 *
 * Ogrenci o = new Insan(); -> Her insan ogrenci degildir.
 * Laptop laptop = new Bilgisayar(); -> Her bilgisayar laptop degildir.
 *
 */

public class Polymorphism {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Kopek kopek = new Kopek("Golden");
        Balik balik = new Balik("Hamsi");
        System.out.println("-----------------------------------------");
        // COMPILER TIME
        hayvan.adiniSoyle();
        kopek.adiniSoyle();
        balik.adiniSoyle();
        System.out.println("-----------------------------------------");
        // RUNTIME
        adiniSoyle(hayvan);
        adiniSoyle(kopek);
        adiniSoyle(balik);
    }

    /**
     *      Methodları farklı şekilde kullanabiliriz.
     *
     *     public static void adiniSoyle(Hayvan h) {
     *         // Burada işlemler yapilabilir.
     *     }
     *     public static void adiniSoyle(Kopek k) {
     *         // Burada işlemler yapilabilir.
     *     }
     *     public static void adiniSoyle(Balik b) {
     *         // Burada işlemler yapilabilir.
     *     }
     *
     */

    /**
     *
     * Bu methodda olan olay şu;
     * Hayvan sınıfı harici bir parametre yolladığımızda bir üst methoda göre işlem yapar. ( UPCASTING )
     * Aynı zamanda burda geç-bağlama / late binding kavramı söz konusu. Çünkü buradaki işlem runtime'da belli oluyor.
     */
    public static void adiniSoyle(Hayvan hayvan) {
        hayvan.adiniSoyle();
        System.out.println("Ben static adiniSoyle methoduyum.");
    }

}

class Hayvan {
    private int ayakSayisi;
    private String tuyRengi;

    public Hayvan() {
        System.out.println("Hayvan sinifi bos constructor calisti.");
    }

    public Hayvan(int ayakSayisi, String tuyRengi) {
        this.ayakSayisi = ayakSayisi;
        this.tuyRengi = tuyRengi;
        System.out.println("Hayvan sinifi dolu constructor calisti.");
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public String getTuyRengi() {
        return tuyRengi;
    }

    public void setTuyRengi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }

    public void adiniSoyle() {
        System.out.println("Ben hayvan sinifina ait adiniSoyle methoduyum.");
    }
}

class Kopek extends Hayvan {
    private String tur;

    public Kopek() {
        System.out.println("Kopek sinifi bos constructor calisti.");
    }

    public Kopek(String tur) {
        this.tur = tur;
        setAyakSayisi(4);
        setTur(tur);
        System.out.println("Kopek sinifi dolu constructor calisti.");
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben kopek sinifina ait adiniSoyle methoduyum.");
    }
}

class Balik extends Hayvan {
    private String cinsi;

    public Balik() {
        System.out.println("Balik sinifi bos constructor calisti.");
    }

    public Balik(String cinsi) {
        this.cinsi = cinsi;
        setCinsi(cinsi);
        System.out.println("Balik sinifi dolu constructor calisti.");
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben balik sinifina ait adiniSoyle methoduyum.");
    }
}
