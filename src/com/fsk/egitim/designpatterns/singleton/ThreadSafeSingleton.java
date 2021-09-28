package com.fsk.egitim.designpatterns.singleton;

/**
 * JVM Sürekli thread safe olduğunu kontrol edecek ve maliyet - performans kaybı.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    public void threadSafeSingletonMethod(){
        System.out.println("Thread Safe Singleton calisti.");
    }
}
