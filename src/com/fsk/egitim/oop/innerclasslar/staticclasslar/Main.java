package com.fsk.egitim.oop.innerclasslar.staticclasslar;

public class Main {
    public static void main(String[] args) {
        DisaridakiClass disaridakiClass = new DisaridakiClass();
        disaridakiClass.degisken = 10;
        disaridakiClass.method1();
        disaridakiClass.methodlaraErisim();
        disaridakiClass.staticDegisken = 10;
        DisaridakiClass.staticDegisken = 20;

        DisaridakiClass.StaticIcClass icClass = new DisaridakiClass.StaticIcClass();
        icClass.staticIcClassDegiskeni = 10;
        icClass.normalMethod();
        icClass.staticMethod();

        DisaridakiClass.StaticIcClass.staticIcClassStaticDegiskeni = 20;

    }
}
