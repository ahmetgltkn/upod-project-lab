package loop.forLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir kelime girin:");
            String word = scanner.nextLine();

            String reversedWord = "";
//
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reversedWord += word.charAt(i);
//            }
//            System.out.println("Kelimenin tersi: " + reversedWord);

//            for(int i = 0 ; i< word.length(); i++ ){
//                reversedWord = word.charAt(i) + reversedWord;
//                System.out.println(reversedWord);
//
//
//            }

//       System.out.println("Kelimenin tersi (EMRE) : " + reversedWord);
        System.out.println(word.length());
        for(int i = 0 ; i< word.length(); i++ ){

            reversedWord =reversedWord +  word.charAt(word.length()-i-1);
        }

        System.out.println("Kelimenin tersi: (SÜHA) " + reversedWord);


    }
}
