package com.fsk.egitim.oop.polymorphism;

/**
 * Static ve Final methodlar override edilemedikleri için daha compiler anında
 * çalıştırılacağı methodlar bellidir. Bundan dolayı Erken Bağlama / Earl Binding.
 */
public class BindingTurleri {
    public static void main(String[] args) {

        UstSinif ustSinif = new UstSinif();
        AltSinif1 altSinif1 = new AltSinif1();
        ustSinif.adiniSoyleStatic();
        altSinif1.adiniSoyleStatic();

        //POLYMORPHISM - Compiler Time'da çalişir. Daha hızlı ve daha performanslidir.
        // Bu durumun olması için methodların static veya final olması lazım.

        // Alt sınıfın adiniSoyle methodu cagrilir.
        UstSinif ustSinif1 = new AltSinif1();
        ustSinif1.adiniSoyleStatic();
        ustSinif1.adiniSoyle();

        /*
        long a = 5;
        int b = 5;
        a = b;    -> Büyüğü küçüğe atabiliyoruz.
        b = a; -> Kızar
         */

        // DownCasting
        //AltSinif1 altSinif11 = (AltSinif1) ustSinif1;


        Object nesne = new UstSinif();

        //AltSinif'taki adını söyle methodunu çağırır.
        UstSinif nesne2 = new AltSinif1();
        System.out.println("*******************");
        nesne2.adiniSoyle();

        AltSinif1 altSinif11 = (AltSinif1) nesne2;
        System.out.println("*******************");
        altSinif11.adiniSoyle2();


    }

    public static void adiniSoyle(UstSinif item) {
        if (item instanceof UstSinif) {
            item.adiniSoyle();
        }else if(item instanceof AltSinif1) {
            item.adiniSoyle();
        }
    }
}

class UstSinif {
    public static void adiniSoyleStatic () {
        System.out.println("Ben Ust sinifin static adiniSoyle methoduyum.");
    }

    public void adiniSoyle () {
        System.out.println("Ben Ust sinifin static olmayan adiniSoyle methoduyum.");
    }
}

class AltSinif1 extends UstSinif {
    public static void adiniSoyleStatic () {
        System.out.println("Ben Alt sinif1'in static adiniSoyle methoduyum.");
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben Ust sinifin static olmayan adiniSoyle methoduyum.");
    }

    public void adiniSoyle2() {

    }
}
