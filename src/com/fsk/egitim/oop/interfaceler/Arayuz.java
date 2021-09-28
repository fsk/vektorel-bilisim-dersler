package com.fsk.egitim.oop.interfaceler;

/**
 * ---- INTERFACE / ARAYUZ ----
 * 1) Genellikle methodların sadece imzası olur. İçi dolu olmaz.
 * 2) Farklı alakasız class'ları ortak bir çatı altında toplayabilir.
 * 3) İçeriğe yazılan methodlar, yazılsa da yazılmasa da publictir ve public olmak zorundadır.
 * 4) Bir class bir interface'i implemente eder. Ama bir interface başka bir interface'i extend eder.
 * 5) Javada çoklu kalıtım yoktur. İnterface'ler ile bu durumun aslında önüne geçilmiştir.
 * 6) Bir abstract class bir interface'i implemente edebilir ve interface'in methodlarını
 * override etmek zorunda kalmaz. (Çünkü ikisi de soyut.)
 * 7) Bir abstract class'ın içerisinde kendi field tanımları olabilir. Ama bunlara ilk değer atamaları
 * yapılmak zorunda. Ayrıca bu değişkenler default olarak public ve statiktir.
 * 8) Bir interface birden fazla interface'i extend edebilir. Bir class ise birden fazla interfacei
 * implement edebilir.
 * 9) java 8 ile birlikte default ve statik anahtar kelimeleriyle içi dolu methodlar tanımlayabiliyoruz.
 * 10) İnterface'lerin kurucu blockları olamaz.
 */

public class Arayuz {
    public static void main(String[] args) {

    }
}

interface Yenilebilir {
    void yemeSekli();

    //static method tanımı yapılabilir.
    static void a(){

    }

    default String name(){
        return "";
    }
}

interface A {

}

interface B extends Yenilebilir, A {

}
