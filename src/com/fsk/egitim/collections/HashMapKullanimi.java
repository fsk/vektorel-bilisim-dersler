package com.fsk.egitim.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * --- MAP INTERFACEI ---
 * 1) Key Value değerine göre saklanır.
 * 2) Bir key değeri bir defa olur. Eger bir key degerinden 2 tane olursa son yazılan key degerinin
 * valuesi ekranda basılır.
 * 3) Çıktılar girilen değerlerin hash code'larına göre sıralanır.
 * 4) HashMap - LinkedHashMap
 * HashMap hashcode'une göre sıralama yaparken linkedhash map girdiğiniz sıraya göre sıralama verir.
 * 5) HashMap biraz daha hızlıdır.
 * 6) Eğer bir kurala göre ekranda belirli bir mantıga göre görmek istiyorsak da TreeMap'leri kullanmalıyız.
 */
public class HashMapKullanimi {
    public static void main(String[] args) {
        HashMap<Integer, String> plakalar = new HashMap<>();
        // -> put() = eleman eklemeye yardımcı olur.
        plakalar.put(1,"Adana");
        plakalar.put(6,"Ankara");
        plakalar.put(35,"Izmir");
        plakalar.put(16,"Bursa");
        plakalar.put(34,"Istanbul");
        plakalar.put(42,"Konya");
        plakalar.put(null, "null deger"); //Null value saglanabilir.

        //Ekrana çıktıyı hash code değerlerine göre verir.
        System.out.println(plakalar);

        // -> get() = key değerine göre eleman getirir.
        System.out.println(plakalar.get(6));

        // -> size() = hashmap'in size'ını verir.
        // -> isEmpty() = hashmap'in bos olup olmadıgını verir.

        System.out.println(plakalar.containsKey(34)); //Key degerine gore iceriyor mu
        System.out.println(plakalar.containsValue("Canakkale")); //Value degerine gore iceriyor mu

        // -> remove() = verilen key degerini once ekranda gosterir sonra siler.
        // -> clear() = hashmap icerisindeki degerleri siler.

        for (Integer key : plakalar.keySet()) {
            System.out.print("Key: " + key);
        }

        System.out.println();

        for (String iller:
             plakalar.values()) {
            System.out.print(iller);
        }


        for(Map.Entry<Integer, String> entry : plakalar.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
