package loop.whileLoop;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Toplamak istediğiniz sayıları girin. Program sonlansın istiyorsanız 0'a basın. ");

        while (true){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            sum += number;
            System.out.println("Sayılarımızın toplamı = " + sum);

        }
    }
}
