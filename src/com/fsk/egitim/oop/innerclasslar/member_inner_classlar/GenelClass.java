package com.fsk.egitim.oop.innerclasslar.member_inner_classlar;

public class GenelClass {

    private int privateDegisken = 1;
    int defaultDegisken = 2;
    protected int protectedDegisken = 3;
    public int publicDegisken = 4;

    private void privateMethod() {
        DiziYazdir nesne = new DiziYazdir();
        System.out.println(nesne.dahiliPrivateDegisken);
        System.out.println(nesne.dahiliDefaultDegisken);
        System.out.println(nesne.dahiliProtectedDegisken);
        System.out.println(nesne.dahiliPublicDegisken);
    }

    void defaultMethod() {
        System.out.println("Dis sinifin (GenelClass) default methodu");
    }

    protected void protectedMethod() {
        System.out.println("Dis sinifin (GenelClass) protected methodu");
    }

    public void publicMethod() {
        System.out.println("Dis sinifin (GenelClass) public methodu");
    }



    // DAHILI INNER CLASS
    public class DiziYazdir {
        private int dahiliPrivateDegisken = 11;
        int dahiliDefaultDegisken = 12;
        protected int dahiliProtectedDegisken = 13;
        public int dahiliPublicDegisken = 14;


        //private
        public void diziYazdir(String[] dizi) {
            System.out.println(dahiliPrivateDegisken);
            System.out.println(dahiliDefaultDegisken);
            System.out.println(dahiliProtectedDegisken);
            System.out.println(dahiliPublicDegisken);

            for (String item:
                 dizi) {
                System.out.println(item);
            }
        }

        //private
        public void methodlaraErisim() {
            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
        }


    }


}
