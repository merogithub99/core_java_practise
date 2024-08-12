package lunchDivide;

import java.util.Arrays;
import java.util.Scanner;

public class lunchDividerCopy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the total amount for the lunch?");
        int totalAmount = scanner.nextInt();
        System.out.println("What is the number of people who had lunch?");
        int totalPeople = scanner.nextInt();
        int[] priceList = new int[totalPeople];

        for (int i = 0; i < totalPeople; i++) {
            System.out.println("Enter the money paid by person " + (i + 1));
            int money = scanner.nextInt();
            priceList[i] = money;
        }

        int priceToEach = totalAmount / totalPeople;
        System.out.println("Price to each: " + priceToEach);
        System.out.println("Current price paid by each: " + Arrays.toString(priceList));

        for (int i = 0; i < totalPeople; i++) {
            System.out.println("Person " + (i + 1) + " paid: " + priceList[i]);

            if (priceList[i] < priceToEach) {
                int currentPrice = priceList[i];
                int difference = priceToEach - currentPrice;
                priceList[i] = currentPrice + difference;
                System.out.println("The person " + (i + 1) + " should give the money " + difference + " to balance the price for each");
            }

            if (priceList[i] > priceToEach) {
                int currentPrice = priceList[i];
                int difference = currentPrice - priceToEach;
                priceList[i] = currentPrice - difference;
                System.out.println("The person " + (i + 1) + " will get the money " + difference + " back");
            }

            if (priceList[i] == priceToEach) {
                priceList[i] = priceToEach;
                System.out.println("You gave enough money for your lunch");
            }
        }

        System.out.println("Balanced price for each is: " + Arrays.toString(priceList));
    }
}
