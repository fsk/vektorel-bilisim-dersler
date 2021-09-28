package com.fsk.egitim.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * UNUTMA
 * LinkedListlerde node var. Yani her bir değer node'dur.
 */

public class ListelerinGezilmesi {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(5);
        sayilar2.add(6);

        System.out.println("For dongusu ile sayilar1 Arraylistinin gezilmesi");
        for (int i = 0; i <sayilar1.size() ; i++) {
            System.out.print(sayilar1.get(i) + " ");
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Foreach ile sayilar2 Arraylistinin gezilmesi");
        for (Integer item:
             sayilar2) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("---------------------");
        /*System.out.println("Sayilar1 ve sayilar2 arraylistlerindeki ortak olan sayilari cikar.");
        for (int i = 0; i <sayilar1.size() ; i++) {
            if (sayilar2.contains(sayilar1.get(i))){
                sayilar1.remove(i);
            }
        }
        System.out.println("Cikarma isleminden sonra sayilar1 : " + sayilar1);*/

        /**
         * Eğer ki indeksi ilgilendiren, indeksi silen ya da değiştiren işlemlerde
         * for döngüsü kullanılmaz.
         */

        System.out.println("Iterator ile listenin gezilmesi.");
        /**
         * Iterator ile set yapıları da gezilebilir. Map yapıları da gezilebilir.
         */

        Iterator<Integer> iterator = sayilar1.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if (sayilar2.contains(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println(sayilar1);

        /**
         * Sadece listlere özgü bir yapı var.
         * ListIterator.
         */

        System.out.println("List Iterator");
        ListIterator<Integer> listIterator = sayilar2.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("List Iterator ile sondan başa gezmek.");
        ListIterator<Integer> listIteratorSondanBasa = sayilar2.listIterator(sayilar2.size());
        while (listIteratorSondanBasa.hasPrevious()) {
            System.out.println("Index: " + listIteratorSondanBasa.previousIndex() + " eleman:  " + listIteratorSondanBasa.previous());
        }


    }
}
