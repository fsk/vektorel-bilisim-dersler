package com.fsk.egitim.designpatterns.singleton;

/**
 * Inner class, dış class'a ihtiyaç olduğunda oluşturulur.
 *
 */
public class BillPugh {

    private BillPugh(){}

    public static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final  BillPugh INSTANCE = new BillPugh();
    }
}
