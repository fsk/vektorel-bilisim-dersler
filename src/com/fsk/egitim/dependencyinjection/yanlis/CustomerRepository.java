package com.fsk.egitim.dependencyinjection.yanlis;

/**
 * Veritabanı ile bağlantı kurulan yer.
 */
public class CustomerRepository {

    public void add(int type){
        if (type == 1) {
            System.out.println("Oracle veritabanına eklenme islemi gerceklesti.");
        }else if(type == 2) {
            System.out.println("MySQl veritabanına eklenme islemi gerceklesti.");
        }else if (type == 3) {
            System.out.println("PostgreSQL veritabanına eklenme islemi gerceklesti.");
        }

    }
}
