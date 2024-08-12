package functionPractise.oop;
//Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
// and otherwise returns false. In main() method accept a string from the user and count the number of vowels in that string.

import java.util.Scanner;

public class Que22 {

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character:");

        char c = scanner.nextLine().charAt(0);
        System.out.println(c + " is a vowel:" + isVowel(c));


    }
}
