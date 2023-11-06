public class Main {
    public static void main(String[] args) {
        // While döngüsüne benzer aradaki fark şudur kodlar do içinde yazılır.
        // koşul while da bulunur. kod en az 1 defa çalışır. çünkü koşul sondadır. önce kodu çalışır. koşul sağlarsa devem eder sağlamazsa durur.
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-while Döngüsü Bitti. ");


    }
}