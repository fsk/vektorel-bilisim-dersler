package com.fsk.egitim.oop.interfaceler;

import java.util.Arrays;


/**
 * --- Compareable Interface'i ---
 * Arrays.sort() methoduyla biz Integer Double String gibi dizileri birbirleri içerisinde sıralayabiliyoruz.
 * Burada tek önemli olan şey birbirleriyle karşılaştırılabilir ifadeler olmasıdır. Bunun sebebi
 * Arrays sınıfının içerisinde compareTo methodu vardır. Ve bu methoddan dolayı bu değerler sıralanabilir.
 *
 * Ama bizim tanımladığımız sınıflarda bu durum söz konusu değildir.
 */

public class ComparableInterface {
    public static void main(String[] args) {


        String[] sehirler = {"Ankara", "Istanbul", "Izmir", "Bursa", "Balikesir"};

        System.out.println("--- Dizi sıralamadan önce ---");
        for (String item:
             sehirler) {
            System.out.println(item);
        }

        Arrays.sort(sehirler);

        System.out.println("--- Dizi sıralandiktan sonra ---");
        for (String item:
                sehirler) {
            System.out.println(item);
        }




        Ogrenci ogrenci1 = new Ogrenci(5,"Furkan");
        Ogrenci ogrenci2 = new Ogrenci(7,"Sahin");
        Ogrenci ogrenci3 = new Ogrenci(9,"Ahmet");
        Ogrenci ogrenci4 = new Ogrenci(4,"Hasan");
        Ogrenci ogrenci5 = new Ogrenci(2,"Ayse");
        Ogrenci ogrenci6 = new Ogrenci(6,"Fatma");

        //Ogrenci[] ogrenciler = new Ogrenci[6];
        Ogrenci[] ogrenciler = {ogrenci1, ogrenci2, ogrenci3, ogrenci4, ogrenci5, ogrenci6};

        Arrays.sort(ogrenciler);
        for (Ogrenci item:
                ogrenciler) {
            System.out.println(item);
        }




    }
}

class Ogrenci implements Comparable<Ogrenci> {
    int id;
    String adi;

    public Ogrenci(int id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", adi=" + adi +
                '}';
    }

    @Override
    public int compareTo(Ogrenci o) {

        if (this.id < o.id) {
            return -1;
        }else if (this.id > o.id) {
            return 1;
        }else return 0;

        /*if (this.adi.compareTo(o.adi) < 0) {
            return -1;
        }else if (this.adi.compareTo(o.adi) > 0) {
            return 1;
        }else return 0;*/
    }
}
