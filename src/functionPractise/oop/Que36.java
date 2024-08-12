package functionPractise.oop;

import java.util.Scanner;

public class Que36 {

    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, n);
            number /= 10;
        }

        return result == originalNumber;
    }

    static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input any number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println("The " + number + " is an Armstrong number.");
        } else {
            System.out.println("The " + number + " is not an Armstrong number.");
        }

        if (isPerfect(number)) {
            System.out.println("The " + number + " is a Perfect number.");
        } else {
            System.out.println("The " + number + " is not a Perfect number.");
        }

        scanner.close();
    }
}
