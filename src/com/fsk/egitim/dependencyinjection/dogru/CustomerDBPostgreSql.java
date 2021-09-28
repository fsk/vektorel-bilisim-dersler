package com.fsk.egitim.dependencyinjection.dogru;

public class CustomerDBPostgreSql implements CustomerRepository{
    @Override
    public void add() {
        System.out.println("PostgreSQL veritabanına ekleme işlemi gerçekleştirildi.");
    }
}
