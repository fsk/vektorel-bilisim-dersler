package com.fsk.egitim.dependencyinjection.dogru;

public class Main {
    public static void main(String[] args) {
        //CustomerService customerService = new CustomerService();
        CustomerService customerService = new CustomerService(new CustomerDBOracle());
        customerService.add();
    }
}
