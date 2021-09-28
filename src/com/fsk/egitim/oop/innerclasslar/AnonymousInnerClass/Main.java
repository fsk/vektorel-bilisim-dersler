package com.fsk.egitim.oop.innerclasslar.AnonymousInnerClass;

/**
 * ---- ANONYMOUS INNER CLASSLAR ----
 * Bir kodlama yaptınız ve bu kodlama birden fazla yerde birden fazla kurumda kullanılıyor.
 * Orn: Hesaplayıcı sınıfı altındaki topla() methodu.
 *
 * Bu methodu 20 farklı kurumda kullandınız.
 * Sadece bir kurumda bu topla() methodunu değiştirmek istediniz.
 * Ne yaparsınız. Gidip o class'ı extend alırsınız. Sonra topla() methodunu override edip içeriğini değiştirirsiniz.
 *
 * Bir suru işlem.
 *
 * Bunun yerine anonymous inner class'lardan yararlanılabilir.
 */
public class Main {
    public static void main(String[] args) {
        Hesaplayici hesaplayici = new Hesaplayici();
        hesaplayici.topla(9,16);


        /*Hesaplayici hesaplayici2 = new Hesaplayici(){
            @Override
            public void carp(int s1, int s2) {
                System.out.println("Burasi Carpma islemine ait bir yer.");
                super.carp(s1, s2);
            }
        };*/

        Hesaplayici hesaplayici2 = new Hesaplayici(){
            @Override
            public void carp(int s1, int s2) {
                System.out.println("Burasi Carpma islemine ait bir yer.");
                super.carp(s1, s2);
            }
        };


        hesaplayici2.carp(7,9);


        Hayvan h = new Hayvan() {
            @Override
            void adiniSoyle() {
                System.out.println("Ben abstract adiniSoyle() methoduyum.");
            }

            @Override
            void selamVer() {
                super.selamVer();
            }
        };

        h.adiniSoyle();
        h.selamVer();

        Canli c = new Canli() {
            @Override
            public void nefesAl() {
                System.out.println("Ben nefes Alırım");
            }
        };

        c.nefesAl();
    }



}

class YeniClass extends Hesaplayici {
    @Override
    public void topla(int s1, int s2) {
        System.out.println("Burasi Savunma Bakanligidir.");
        super.topla(s1, s2);
    }
}


abstract class Hayvan {
    abstract void adiniSoyle();

    void selamVer() {
        System.out.println("Selam verildi.");
    }
}


interface Canli {
    void nefesAl();
}


