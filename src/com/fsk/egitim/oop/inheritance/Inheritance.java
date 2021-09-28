package com.fsk.egitim.oop.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        GeometrikSekil gs = new GeometrikSekil(4,5);
        gs.alanHesapla();
        gs.cevreHesapla();
        Dikdortgen d = new Dikdortgen(5,7);
        d.alanHesapla();
    }
}

class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil() {}

    public GeometrikSekil(int en, int boy){
        this.en = en;
        this.boy = boy;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alanHesapla() {
        System.out.println("Geometrik Sekil Sinifi Alani: " + this.getEn() * this.getBoy());
        //System.out.println("Geometrik Sekil Sinifi Alani: " + getEn() * getBoy());
        //System.out.println("Geometrik Sekil Sinifi Alani: " + this.en * this.boy);
        //System.out.println("Geometrik Sekil Sinifi Alani: " + en * boy);
    }

    public void cevreHesapla() {
        System.out.println("Geometrik Sekil Sinifi Cevresi: " + 2*(this.getBoy() + this.getEn()) );
    }
}


class Dikdortgen extends GeometrikSekil{

    public Dikdortgen(int en, int boy) {
        setEn(en);
        setBoy(boy);
    }

    @Override
    public void alanHesapla() {
        System.out.println("Diktortgen sinifinin Alani: " + getEn() * getBoy());
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdortgen sinifinin Cevresi: " + 2 * (getEn() * getBoy()));
    }
}