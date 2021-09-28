package com.fsk.egitim.dependencyinjection.dogru;

/**
 * Bir class başka bir class'ı kullandığında onu new lememelidir.
 * interface tipinde burada bir dependency injection yapılmalıdır.
 */
public class CustomerService {

    /**
     * Business Logicler
     */

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public void add(){
        //CustomerDB customerRepository = new CustomerDB();
        customerRepository.add();
    }
}
