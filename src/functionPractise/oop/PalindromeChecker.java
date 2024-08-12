package functionPractise.oop;

import java.util.Scanner;

//Write a method that takes as input a non-negative integer and returns true if the number is a palindrome;
// otherwise, it returns false. Also write a program to test your method.
//palindrome-12321  1221
public class PalindromeChecker {

//    static boolean palindromeCheck(int number) {
//        if (number < 0) {
//            System.out.println("please enter a positive number ");
//            return false;
//        }
//        String num = Integer.toString(number);
//        if (!(num.length() % 2 == 0)) {
//
//            int midIndex = (num.length() + 1) / 2;
//            StringBuilder s1 = new StringBuilder(num.substring(0, midIndex - 1));
//            String s2 = num.substring(midIndex);
//            String newString = String.valueOf(s1.reverse());
//            if (newString.equals(s2)) {
//                return true;
//            }
//            return false;
//        }
//        if(num.length() % 2 == 0){
//            int midIndex=num.length()/2;
//            String s1=num.substring(0,midIndex);
//            String s2=num.substring(midIndex);
//            StringBuilder sb= new StringBuilder(s2);
//            String newString= String.valueOf(sb.reverse());
//            if(newString.equals(s1)){
//                return true;
//            }
//            return  false;
//
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the number to check palindrome or not:");
//        int num = scanner.nextInt();
//        System.out.println(num +" number is palindrome ?:"+ palindromeCheck(num));
//    }
static boolean palindromeCheck(int number) {
    if (number < 0) {
        System.out.println("Please enter a positive number.");
        return false;
    }

    String num = Integer.toString(number);
    int length = num.length();

    for (int i = 0; i < length / 2; i++) {
        if (num.charAt(i) != num.charAt(length - 1 - i)) {
            return false;
        }
    }

    return true;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is a palindrome:");
        int num = scanner.nextInt();
        System.out.println(num + " is a palindrome? " + palindromeCheck(num));
        scanner.close();
    }

}
