package com.fsk.egitim.oop.innerclasslar.member_inner_classlar.ornek;

public class HesapMakinesi {

    //LOCAL INNER CLASS LAR
    public void kisiTanit() {
        class Ogrenci {
            private String name;
            private String surname;
            private String bestProgrammingLanguage;

            public Ogrenci () {
                this.name = "Furkan";
                this.surname = "Kulaksiz";
                bestProgrammingLanguage = "Java";
            }

            @Override
            public String toString() {
                return "Ogrenci{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", bestProgrammingLanguage='" + bestProgrammingLanguage + '\'' +
                        '}';
            }
        }

        Ogrenci o = new Ogrenci();
        System.out.println(o.toString());
    }

    public int carp(int x, int t) {
        Carpma carpma = new Carpma();
        int sonuc = carpma.carpmaIslemi(x,t);
        return sonuc;
    }

    public class Topla {
        public int toplama(int i, int j){
            return i + j;
        }
    }

    class Cikarma {
        public int cikarma(int i, int j) {
            return i - j;
        }
    }

    private class Carpma {
        public int carpmaIslemi(int i, int j) {
            return i * j;
        }
    }

    class Bolme {
        public int bolme(int i, int j) {
            if (j == 0) {
                System.out.println("Bolen 0 olamaz.");
                return -1;
            }else return i / j;
        }
    }


}
