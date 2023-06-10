package loop.whileLoop;

import java.util.Scanner;

public class FactorialCalculator {

    // 5! = 5 * 4 * 3 * 2 * 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini bulmasını isteidğiniz sayıyı girin: ");
        int num = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        while (i<=num){
            factorial *=i;
            System.out.println(factorial);
            i++;
        }
        System.out.println(num + " sayısının faktöriyeli: " + factorial);
    }
}
