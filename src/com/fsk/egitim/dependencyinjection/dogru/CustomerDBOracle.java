package com.fsk.egitim.dependencyinjection.dogru;

public class CustomerDBOracle implements CustomerRepository {

    @Override
    public void add() {
        System.out.println("Oracle Veritabanına eklenme işlemi gerçekleştirildi.");
    }
}
