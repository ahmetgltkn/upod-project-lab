package loop.forLoop;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for(baslangic; koşul ; adım ){

        baslangic --> döngümüzü başlatmak istediğimiz değerimizi yazarız.
        koşul --> döngümüzün kaç tur atacağını belirliyor. ve bu koşul doğru olduğu
        sürece döngümüz çalışır.
        adım --> genelde değişkenimizi arttırır veya azaltırız.

        }
         */
        for (int i = 0 ; i<= 10 ; ++i ){
            System.out.println("döngü numarası:  " + i);
        }
        for( ;; ){
            System.out.println("bu bir sonsuz döngüdür");
        }
    }
}
