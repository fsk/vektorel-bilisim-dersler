package com.fsk.egitim;

import com.fsk.egitim.oop.Insan;

public class Main {



    public static void main(String[] args) {
        Insan insan1 = new Insan();
        Insan furkan = new Insan("Furkan", "Kulaksiz", "12345678910", 'E', 27);
        Insan sahin = new Insan("Sahin", "Erdemir", "9876543210", 'E', 32);
        System.out.println("------------------------------------");
        System.out.println(furkan.toString());
        System.out.println(sahin.toString());
        System.out.println("------------------------------------");
        furkan = sahin;
        System.out.println(furkan.toString());
        System.out.println(sahin.toString());


    }
}
