package com.fsk.egitim.generic.genericclasslar;


/**
 *
 * Genellikle <GelenVeriTuru> yazilan yere buraya Tip değişkeni geldiği için T Harfi kullanılır.
 */
public class GenericDiziYazdir<GelenVeriTuru> {
    public void yazdir(GelenVeriTuru[] dizi){
        for (GelenVeriTuru item:
             dizi) {
            System.out.println(item);
        }
    }
}
