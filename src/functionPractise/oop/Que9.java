package functionPractise.oop;

//WAP to check whether a number is even or odd using function. The function
// name should be isEven(int parameter), which returns true if the number
// is even and return false if the number is  odd.

import java.util.Scanner;

public class Que9 {

   static boolean isEven( int number){
       return number % 2 == 0;

   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check either even or false");
        int num= scanner.nextInt();
        System.out.println( "the number entered is even ?? :"+isEven(num));

    }

}
