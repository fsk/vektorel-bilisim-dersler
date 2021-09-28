package com.fsk.egitim.oop.polymorphism;

//En son bu kısım anlatılacak.
public class InstanceOF {
    public static void main(String[] args) {
        GeometrikSekil gs = new GeometrikSekil();
        Dikdortgen dk = new Dikdortgen(5,4);
        Kare k = new Kare(7);
        Daire d = new Daire(5);
    }

    public static void alanHesapla(GeometrikSekil sekil){
        if ( sekil instanceof GeometrikSekil) {
            sekil.alanHesapla();
        }else if (sekil instanceof Dikdortgen) {
            Dikdortgen dikdortgen = (Dikdortgen) sekil;
            dikdortgen.alanHesapla();
        }else if (sekil instanceof Kare) {
            Kare kare = (Kare) sekil;
            kare.alanHesapla();
        }else {
            Daire daire = (Daire) sekil;
            sekil.alanHesapla();
        }
    }
}

class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil(){

    }

    public GeometrikSekil(int en, int boy) {
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

    public void alanHesapla(){
        System.out.println("Geometrik Seklin Alan Bilgisi : " + getEn() * getBoy());
    }
}

class Dikdortgen extends GeometrikSekil{
    public Dikdortgen(){ }

    public Dikdortgen(int a, int b) {
        setBoy(a);
        setEn(b);
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dikdortgen sinifinin Alani : " + this.getBoy() * this.getEn());
    }
}

class Kare extends Dikdortgen {
    public Kare(int a) {
        setEn(a);
    }

    @Override
    public void alanHesapla() {
        System.out.println("Karenin Alani : " + this.getEn() * this.getEn());
    }
}

class Daire extends Kare {

    public Daire(int a) {
        super(a);
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dairenin Alani : " + (2*3.14*getEn()));
    }
}


