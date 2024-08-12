package functionPractise.oop;

import java.util.Scanner;

public class LeapYearCheck {
    static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;

            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year to check leap year or not");
        int year = scanner.nextInt();

        boolean isLeap = checkLeapYear(year);

        if (isLeap) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }


    }
}
