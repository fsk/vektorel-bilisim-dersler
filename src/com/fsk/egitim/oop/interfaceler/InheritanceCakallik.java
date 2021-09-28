package com.fsk.egitim.oop.interfaceler;

public class InheritanceCakallik {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void method1();
    void method2();
    void method3();
}

abstract class AbstractClass implements Interface1 {

    void ClassAMethodu() {

    }

    void ClassBMethodu() {

    }

    abstract void AbstractMethod();

    @Override
    public void method3() {

    }
}

class ClassA extends AbstractClass {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    @Override
    void AbstractMethod() {

    }
}
