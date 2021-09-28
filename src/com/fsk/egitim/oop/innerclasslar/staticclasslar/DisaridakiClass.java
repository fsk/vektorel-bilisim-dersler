package com.fsk.egitim.oop.innerclasslar.staticclasslar;

/**
 * Static Inner Class'larda disaridaki sinifin sadece static olan method ve degiskenlerine erisebiliyoruz.
 * Cunku digerleri nesneye bagli olarak degiskenlik gosteren deghiskenler ve methodlar.
 */
public class DisaridakiClass {
    int degisken;
    static int staticDegisken;

    public void method1(){

    }

    public static void staticMethod1() {

    }

    public void methodlaraErisim(){

    }

    static class StaticIcClass {

        int staticIcClassDegiskeni;
        static int staticIcClassStaticDegiskeni;

        public void staticMethod() {
            staticDegisken++;

        }

        public void normalMethod() {

        }

    }

}
