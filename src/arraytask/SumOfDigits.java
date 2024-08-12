package arraytask;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            int quotient = number / 10;
            sum += remainder;
            number = quotient;
        }

        System.out.println("SUM OF DIGITS :: " + sum);
    }

}