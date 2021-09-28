package com.fsk.egitim.oop;

// --- Constructor ---
// 1) Geriye değer döndürmezler.
// 2) Sınıf adı ile aynı olmak zorundalar.
// 3) new diyerek nesne ürettiğimiz zaman ilk tetiklenen methodlardır.
// 4) Parametre aladabilirler, almayadabilirler.
// 5) new Dedikten sonra oluşturulan nesnenin içeriğine göre değişim gösterirler.
// 6) Nesne oluşturulduğu anda bazı değerler atanabilir. Ya da default işlemler yapılabilir.
// 7) Bir class'ta birden fazla consturctor method olabilir. (Method Overloading)
// 8) Constructor methodlar genelde public olarak imlenirler.

public class Insan {
    public String name;
    public String surname;
    public String identityNumber;
    public char cinsiyet;
    public int age;

    public Insan() {
        System.out.println("Bos Constructor calisti.");
    }

    public Insan (String name, String surname) {
        System.out.println("2 parametre alan Constructor calisti.");
        this.name = name;
        this.surname = surname;
    }

    /*
    Insan (String name, String identityNumber) {
        this.name = name;
        this.identityNumber = identityNumber;
    }
     */

    public Insan(String name, String surname, String identityNumber, char cinsiyet, int age) {
        this(name, surname);
        this.identityNumber = identityNumber;
        this.cinsiyet = cinsiyet;
        this.age = age;
        System.out.println("Bütün parametreleri iceren constructor.");
    }

    @Override
    public String toString() {
        return "Insan{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", age=" + age +
                '}';
    }
}
