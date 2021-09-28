package com.fsk.egitim.oop.interfaceler;

public class Arayuz2 {
    public static void main(String[] args) {
        MuslumBaba muslumBaba = new MuslumBaba();
        muslumBaba.sahnedeDansEt();

        //PopSarkicilar popSarkici1 = new Tarkan();
    }
}

interface ArabeskSarkicilar {
    void sahnedeSigaraIc();
}

interface PopSarkicilar {
    void sahnedeDansEt();
}

abstract class Sarkici {
    abstract void sarkiSoyle();
}

class ArabeskSarkici extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk Sarkici sarki soyluyor.");
    }

    /*void sahnedeSigaraIc() {
        System.out.println("Sahnede sigara ic.");
    }*/
}

class PopSarkici extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Pop sarkici sarki soyluyor.");
    }

    /*void dansEt() {
        System.out.println("Dans et.");
    }*/
}

class MuslumBaba implements ArabeskSarkicilar, PopSarkicilar {

    @Override
    public void sahnedeSigaraIc() {

    }

    @Override
    public void sahnedeDansEt() {

    }
}