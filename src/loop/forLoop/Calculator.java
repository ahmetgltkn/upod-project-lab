package loop.forLoop;

public class Calculator {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1 ; i <= 100 ; i++){
            sum += i;
        }
        System.out.println(100*101/2);
        System.out.println("1den 100e kadar olan sayıların toplamı: " + sum);

    }
}
