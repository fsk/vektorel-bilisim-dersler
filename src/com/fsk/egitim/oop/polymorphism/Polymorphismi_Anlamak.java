package com.fsk.egitim.oop.polymorphism;

public class Polymorphismi_Anlamak {
    public static void main(String[] args) {
        Canli hayvan1 = new Ordek();
        ((Ordek)hayvan1).kos();




    }
}

class Canli {
    public void nefesAl(){
        System.out.println("Nefes Alirim.");
    }
}

class Ordek extends Canli {
    public static int ordekNesneSayisi = 0;

    Ordek(){
        ordekNesneSayisi++;
        System.out.println(ordekNesneSayisi);
    }

    @Override
    public void nefesAl() {
        System.out.println("Ordegim. Nefes alirim.");
    }

    public void kos(){
        System.out.println("Ben oregim. Kosabilirim.");
    }
}

class Panda extends Canli {
    public static int pandaNesneSayisi = 0;
    Panda(){
        pandaNesneSayisi++;
        System.out.println(pandaNesneSayisi);
    }
    @Override
    public void nefesAl() {
        System.out.println("Pandayim. Nefes alirim.");
    }

    public void yuz(){
        System.out.println("Pandayim. Yuzebilirim.");
    }
}
