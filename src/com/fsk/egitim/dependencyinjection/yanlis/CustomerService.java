package com.fsk.egitim.dependencyinjection.yanlis;

/**
 * Bir class içerisinde başka bir class kullanılıyorsa o class new lenmemelidir.
 */
public class CustomerService {
    /**
     * Business logicler
     */

    public void add(){
        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.add(1);
    }
}
