package com.fsk.egitim.dependencyinjection.dogru;

public class CustomerDBMySql implements CustomerRepository{
    @Override
    public void add() {
        System.out.println("MySQL veritabanına ekleme işlemi gerçekleştirildi.");
    }
}
