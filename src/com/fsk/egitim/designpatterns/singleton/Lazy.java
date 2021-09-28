package com.fsk.egitim.designpatterns.singleton;

/**
 * Her zaman bir if check yapılır.
 * Şu an thread safe değil.
 */
public class Lazy {

    private static Lazy lazySingleton;

    private Lazy(){

    }

    public static Lazy getLazySingleton() {
        if (lazySingleton == null){
            lazySingleton = new Lazy();
        }
        return lazySingleton;
    }

    public void lazySingleton(){
        System.out.println("Lazy Singleton calisti.");
    }
}
