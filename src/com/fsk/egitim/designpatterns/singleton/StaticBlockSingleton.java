package com.fsk.egitim.designpatterns.singleton;

/**
 * -- Dezavantajları
 *
 * İnstance'ları ayağa kalkar.
 * Thread safe değildir.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;

    static {
        try{
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e) {

        }
    }

    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton getStaticBlockSingleton(){
        return staticBlockSingleton;
    }

    public void staticSingleton(){
        System.out.println("Static Singleton calisti.");
    }
}
