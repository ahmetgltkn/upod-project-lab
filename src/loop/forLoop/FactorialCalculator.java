package loop.forLoop;

import java.util.Scanner;

public class FactorialCalculator {

    // 5! = 5 * 4 * 3 * 2 * 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini bulmasını isteidğiniz sayıyı girin: ");
        int num = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i<= num; i++){
           // factorial = factorial * i;
            factorial *=i;
            // factorial = factorial * i;
            // 1 = 1 * 1 --> 1
            // 1 = 1 * 2 --> 2
            // 2 = 2 * 3 --> 6
            // 6 = 6 * 4 --> 24
            // 24 =24* 5 --> 120
        }
        System.out.println(num + " sayısının faktöriyeli: " + factorial);
    }
}
