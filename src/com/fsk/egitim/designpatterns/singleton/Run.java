package com.fsk.egitim.designpatterns.singleton;

/**
 * Static konusu her seferinde gidecek rame yazılacak. JVM tarafında.
 */
public class Run {
    public static void main(String[] args) {
        Eager.getInstance().eagerSingleton();

        StaticBlockSingleton.getStaticBlockSingleton().staticSingleton();

        Lazy.getLazySingleton().lazySingleton();

        ThreadSafeSingleton.getThreadSafeSingleton().threadSafeSingletonMethod();
    }
}
