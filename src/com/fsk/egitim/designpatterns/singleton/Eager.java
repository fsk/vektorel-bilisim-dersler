package com.fsk.egitim.designpatterns.singleton;

/**
 * --- Singleton Design Pattern ---
 * Mesela db işlemlerimiz için bir class'ımız olsun.
 * KisiDao k = new KisiDao(); // 1KB
 * Ama front end tarafından gelen istek sayısı 1 milyon olursa büyük sıkıntı.
 * Tabi her seferinde class içerisindeki methodlar ve fieldlar da oluşturulacak.
 * Ramde maliyet kaplayacak.
 *
 * İhtiyaçlara göre bu class'tan sadece bir tane instance oluşturmak gerekebilir.
 * Her session için bir tane, her user için bir tane, ya da günde bir tane..
 * İhtiyaca göre değişir.
 *
 * classı da statik yapalım dersek de o da oop paradigmasına aykırı ve başka maliyetler getirecek.
 *
 * -- Eager Initialization
 * Dezavantajları:
 * -- Program her ayağa kalktığında field static olduğu için JVM tarafından bir kere çalıştırılacak.
 * Class'a ihtiyaç duymasam bile bir kere bu instance jvm tarafından oluşturulacak.
 * -- Thread safe değildir.
 * -- Exception Handling problemi vardır.
 */
public class Eager {
    private static final Eager INSTANCE = new Eager();

    private Eager(){}

    public static Eager getInstance(){
        return INSTANCE;
    }

    public void eagerSingleton(){
        System.out.println("Eager Singleton method calisti.");
    }


}
