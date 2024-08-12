package functionPractise.oop;

import java.util.Scanner;

//WAP a java program that takes a number and returns the length of the number.
public class Que15 {

   static int returnLengthOfNumber(int number){
        String numToString = Integer.toString(number);
        return numToString.length();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer to check its length");
        int number= scanner.nextInt();
        System.out.println("the length of the integer "+number + " is: " + returnLengthOfNumber(number) );
    }
}
