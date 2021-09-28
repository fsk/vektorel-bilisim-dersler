package com.fsk.egitim.collections;

import java.util.Objects;

/**
 * HashCode lar kesinlikle bellek adresi degildir.
 * HashCode bizim verdiğimiz nesnenin integer karsılıgıdır.
 * HashMaplerde 16 haneli bir dizi oluşturuluyor.
 */
public class HashCodeCalismaMantigi {
    public static void main(String[] args) {
        String isim1 = "Furkan";
        String isim2 = "Sahin";
        String isim3 = "Kulaksiz";
        String isim4 = "Furkan";

        //Object

        System.out.println(isim1.hashCode());
        System.out.println(isim2.hashCode());
        System.out.println(isim3.hashCode());
        System.out.println(isim4.hashCode());

        Ogrenci ogr1 = new Ogrenci(1, "Furkan");
        Ogrenci ogr2 = new Ogrenci(1, "Furkan");
    }
}

class Ogrenci {
    int i;
    String isim;

    public Ogrenci(int i, String isim) {
        this.i = i;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return i == ogrenci.i && Objects.equals(isim, ogrenci.isim);
    }

    /**
     *
     * @Override
     * public boolean equals(Object o) {
     *     if(this == 0) return true;
     *     if(!(o instanceof Ogrenci)) return false;
     *     Ogrenci ogrenci = (Ogrenci) o;
     *     return i == ogrenci.i &&
     *            Objects.equals(isim, ogrenci.isim);
     * }
     */

    @Override
    public int hashCode() {
        return Objects.hash(i, isim);
    }
}
