package com.fsk.egitim.oop;

/**
 * ---- IMMUTABLE (DEĞİŞMEZ) ----
 * Genellikle bir nesne oluştururuz ve içeriğini değiştiririz.
 * Ama bazen oluşturduğumuz nesnelerin içeriğini değiştirmek istemeyebiliriz.
 * Bu gibi durumlarda izlenilmesi gereken adımlar;
 * 1) Sınıf içerisindeki tüm değerler private olmalı.
 * 2) Getter methodları herhangi bir return işlemi olmamalı
 * ama setter methodları ya olmamalı ya da private olmalı.
 */

public class Immutable {

    public static void main(String[] args) {
        Bilgisayar b = new Bilgisayar(8, 16, new String[]{"HP", "ASUS", "INTEL"});
        bilgisayarBilgileri(b);

        String ureticiler[] = b.getUreticiFirmalar();
        ureticiler[0] = "APPLE";
        bilgisayarBilgileri(b);

    }

    public static void bilgisayarBilgileri(Bilgisayar b) {
        System.out.println("Cekirdek Sayisi: " + b.getCekirdekSayisi()
        + " Ram Kapasitesi: " + b.getRam() + " Uretici Firmalar: " + b.getUreticiFirmalar()[0]);
    }
}

class Bilgisayar {
    private int cekirdekSayisi;
    private int ram;
    private String[] ureticiFirmalar;

    public Bilgisayar(int cekirdekSayisi, int ram, String[] ureticiFirmalar) {
        this.cekirdekSayisi = cekirdekSayisi;
        this.ram = ram;
        this.ureticiFirmalar = ureticiFirmalar;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRam() {
        return ram;
    }

    public String[] getUreticiFirmalar() {
        String kopyaDizi[] = new String[ureticiFirmalar.length];
        for (int i = 0; i <ureticiFirmalar.length ; i++) {
            kopyaDizi[i] = ureticiFirmalar[i];
        }
        return kopyaDizi;
    }
}
