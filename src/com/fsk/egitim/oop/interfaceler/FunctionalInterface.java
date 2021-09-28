package com.fsk.egitim.oop.interfaceler;

public class FunctionalInterface {
    public static void main(String[] args) {

        FunctionalInterfaceKavrami calismak = () -> {
            System.out.println("Ben java calisiyorum.");
        };

        calismak.calis();

        /*
        ToplamaInterfacei toplama = (a, b) -> {
             return a + b;
        };
         */

        ToplamaInterfacei toplama = (a, b) ->  a + b ;

        toplama.topla(4,9);

        FunctionalInterfaceKavrami f = new FunctionalInterfaceKavrami() {
            @Override
            public void calis() {
                System.out.println("Calis");
            }
        };

        f.calis();
    }
}

@java.lang.FunctionalInterface
interface FunctionalInterfaceKavrami {

    void calis();

}

interface ToplamaInterfacei {
    int topla(int a, int b);
}
