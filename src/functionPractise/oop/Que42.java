package functionPractise.oop;

import java.util.Scanner;

public class Que42 {

    public static String concatenateString(String input) {
        String toAdd = " - added to the original string ";
        return input + toAdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String result = concatenateString(userInput);

        System.out.println("Manipulated string: " + result);

        scanner.close();
    }
}
