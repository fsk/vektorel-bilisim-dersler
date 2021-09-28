package com.fsk.egitim.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * --- ARRAYLIST ---
 * 1) Aslında gelişmiş bir arraydir.
 * 2) Ama dizilerden en büyük farkı, arraylerde olduğu gibi sabit bir tanımlama yapılma zorunluluğu yoktur.
 * 3) Dizilerden en büyük farkı istenilen eleman çıkarılır. Silinir. Güncellenir. Eleman eklemesi yapılabilir.
 * 4) Generic bir tip belirtilmezse her türde değer alabilir.
 * 5) Boyut arttırma - azaltma olayı dinamiktir. Bu yüzden arraylerden daha az performans gösterir. Ama bu performans
 * diğer işleri yanında ihmal edilir.
 * 6) Arraylerde primitive tipler ile biz dizi oluştururken Arraylistlerde wrapper sınıflardan yararlanırız.
 * 7) Arraylerde çok boyutlu yapılar oluşturulabilirken ArrayListlerde böyle bir durum yoktur.
 * 8) Arraylerde for veya forEach yardımıyla dizi dolaşılırken, Arraylistlerde Iterator yardımıyla dizi dolaşabilir.
 * 9) Arraylistlerde bir eleman birden fazla kez kullanılabilir.
 */
public class ArraylistKullanimi {
    public static void main(String[] args) {
        //Arraylistlerde eleman ekleme.
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(5);

        //Arraylistlerde başlangıç capacity verilebilir.
        //-> add() = Arraylistin sonuna elemanı ekler.
        ArrayList<String> isimler = new ArrayList<>(5);
        isimler.add("Furkan");
        isimler.add("Sahin");
        isimler.add("Kulaksiz");
        isimler.add("Alperen");
        isimler.add("Ahmet");
        isimler.add("Hasan");
        System.out.println(isimler);
        isimler.ensureCapacity(100); //Başlangıçta verilen initalcapacity'yi arttırır.
        isimler.trimToSize(); //Arraylisti içindeki eleman tutacak kadar küçültür.

        //Bir arrayliste başka bir arraylist parametre olarak verilebilir.
        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);

        //-> size() =  Arraylistin boyutunu döndürür.
        System.out.println(isimler.size());

        //-> isEmpty() = Eğer arraylist boş ise true, değilse false değerini dönderir.
        System.out.println(isimler.isEmpty());

        //-> clear() = Listin hepsini temizler.
        isimlerYedek.clear();

        //-> contains() = Listin içerisinde parametre olarak geçilen değeri arar.
        //eğer varsa true, yoksa false döner.
        isimler.contains("Furkan");
        isimler.contains("Ummuhan");

        //-> toArray() = Bir arraylisti bir diziye dönüştürür.
        String[] isimlerDizi = isimler.toArray(new String[0]);
        System.out.println(isimlerDizi[3]);

        //Collections sinifi Arraylistler için yardimci bir sınıftır. Yeni bir Arraylist oluşturur. Sonuçta referans tipli.
        //Collections.sort(sayilar);
        //System.out.println(sayilar);

        //-> get() =  methodu ile arraylistin bir indexindeki değere ulaşılabilir.
        //Eğer fazla bir indekse ulaşılırsa IndexOutOfBoundException alırız.
        System.out.println(sayilar.get(2));


        //-> set() = Belirtilen indexteki değeri günceller.
        sayilar.set(4,17);
        System.out.println(sayilar.get(4));

        //-> add() = Eğer index belirtilirse oraya eleman ekler.
        //Var olan arraylistin dışındaki bir yere eleman eklenirse IndexOutOfBoundException alırız.
        sayilar.add(3,25);
        //System.out.println(sayilar.get(3));


        //-> remove() = Belirtilen indexteki elemanı siler.
        sayilar.remove(5); // Belirtilen indeksi siler.
        sayilar.remove(17L); // Verilen objeyi siler.

        ArrayList<String> sehrler = new ArrayList<>();
        sehrler.add("Ankara");
        sehrler.add("Samsun");
        sehrler.add("Istanbul");
        sehrler.add("Izmir");
        sehrler.add("Manisa");
        sehrler.add("Mugla");
        sehrler.add("Kayseri");
        sehrler.add("Gaziantep");

        //-> sublist(fromIndex, toIndex) belirtilen indexler aralığını yeni bir liste atar.
        //Alt satır hata verir çünkü sublist geriye bir List döner.
        //ArrayList<String> yeniSehirler = sehrler.subList(4,7);

        //İlk index dahil son index dahil değil.
        List<String> yeniSehirler = sehrler.subList(2,6);
        System.out.println(yeniSehirler);


        ArrayList<String> ulkeler = new ArrayList<>();
        ulkeler.add("Turkiye");
        ulkeler.add("Bulgaristan");
        ulkeler.add("Sirbistan");
        ulkeler.add("Bosna Hersek");
        ulkeler.add("Karadag");
        ulkeler.add("Kosova");
        ulkeler.add("Arnavutluk");
        ulkeler.add("Makedonya");
        ulkeler.add("Yunanistan");

        //-> addAll() = İki listeyi birleştirmek için kullanılır.
        sehrler.addAll(ulkeler);

        sehrler.addAll(4,ulkeler);


        //----------------------------------
        //arrayi listeye donustuebilirme.
        String[] diller = {"Java", "Python", "Javascript", "C"};

        /**
         * yontem1
         * Bir list tanımlanır.
         * Sonra Arrays.aslist diyerek Array List'e çevrilir.
         */

        List<String> dillerListe = Arrays.asList(diller);

        /**
         * yontem2
         * ArrayList'in constructor'u kullanılabilir.
         */

        ArrayList<String> dillerListe2 = new ArrayList<>(Arrays.asList(diller));

        /**
         * yontem3
         * Collections yardımcı sınıfı kullanılabilir.
         */

        List<String> dillerListe3 = new ArrayList<>();
        Collections.addAll(dillerListe3, diller);






    }
}
