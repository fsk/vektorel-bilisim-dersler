package com.fsk.egitim.oop.abstraction;

/**
 * ---- ABSTRACT / ABSTRACTION ----
 * 1) Soyut sınıflardır. Nesne üretilmezler.
 * 2) İçeriğini nasıl dolduracağımız belli olmayan, ve birbirleriyle alakalı sınıfları
 * üst bir çatıda toplamak için kullanılan sınıf türleridir.
 * 3) Eğer bir sınıfın içerisinde abstract bir method varsa alt sınıflar 'muhakkak' o methodu
 * override etmek zorundadırlar. (Bir sınıf içerisinde bir tane abstract method olması bu durum için yeter.)
 * 4) Abstract sınıflar içerisinde hiç abstract method olmayabilir.
 * 5) Abstract sınıflar içerisinde tanımlı olan bir abstract methodun içerisi boş olmalıdır.
 * 6) Abstract sınıflardan nesne üretilemez.
 * 7) Kendi constructorları olabilir. Kendine özgü fieldları olabilir.
 * 8) Abstract methodlar static olamazlar.
 * 9) Abstract bir sınıfın alt sınıfı da abstract olabilir. O zaman, o class'ları extend etmek zorunluluğu
 * ortadan kalkar.
 * 10) Normal bir sınıfın alt sınıfı da abstract olabilir.
 */

public class AbstractionKavrami {
    public static void main(String[] args) {
        GeometrikSekil kare = new Kare(8);
        kare.alanHesapla();
        kare.cevreHesapla();
        kare.adiniSoyle();
        ((Kare) kare).kareMethodu();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        GeometrikSekil dikdortgen = new Dikdortgen(12,5);
        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();
        dikdortgen.adiniSoyle();
        ((Dikdortgen) dikdortgen).dikdortgenMethodu();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        GeometrikSekil daire = new Daire(7);
        daire.alanHesapla();
        daire.cevreHesapla();
        daire.adiniSoyle();
        ((Daire) daire).daireMethodu();
        System.out.println("---------------------------------");
    }

    public static void alanlariKarsilastir(GeometrikSekil item1, GeometrikSekil item2) {
        if (item1.getHesaplananAlan() < item2.getHesaplananAlan()) {
            System.out.println("Birinci parametrenin alani < İkinci parametrenin alani");
        }else if (item1.getHesaplananAlan() > item2.getHesaplananAlan()){
            System.out.println("Birinci parametrenin alani > İkinci parametrenin alani");
        }else {
            System.out.println("Birinci parametrenin alani = İkinci parametrenin alani");
        }
    }
}

abstract class GeometrikSekil {
    private int birinciKenar;
    private int hesaplananAlan;

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    public abstract void cevreHesapla();

    public abstract void alanHesapla();

    public abstract void adiniSoyle();
}

class Kare extends GeometrikSekil {

    public Kare(int kenar) {
        setBirinciKenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin cevresi: " + getBirinciKenar() * 4);
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * getBirinciKenar());
        System.out.println("Karenin alani: " + getHesaplananAlan());
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben Kare sinifi adiniSoyle methoduyum.");
    }

    public void kareMethodu() {
        System.out.println("Ben sadece kare sinifina ait bir methodum.");
    }
}

class Dikdortgen extends GeometrikSekil {

    private int ikinciKenar;

    public Dikdortgen(int birinciKenar, int ikinciKenar) {
        setBirinciKenar(birinciKenar);
        this.ikinciKenar = ikinciKenar;
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdortgenin Cevresi: " + 2 * (getBirinciKenar() + getIkinciKenar()));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(2 * (getBirinciKenar() * getIkinciKenar()));
        System.out.println("Dikdortgenin Alani: " + getHesaplananAlan());
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben Dikdortgen sinifi adiniSoyle methoduyum.");
    }

    public void dikdortgenMethodu() {
        System.out.println("Ben sadece dikdortgen sinifina ait bir methodum.");
    }
}

class Daire extends GeometrikSekil {

    public Daire(int yariCap) {
        setBirinciKenar(yariCap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin Cevresi: " + 2*3.14*getBirinciKenar());
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) (3.14 * getBirinciKenar() * getBirinciKenar()));
        System.out.println("Dairenin Alani: " + getHesaplananAlan());
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben daire sinifi adiniSoyle methoduyum.");
    }

    public void daireMethodu() {
        System.out.println("Ben sadece daire sinifina ait bir methodum.");
    }
}
