package functionPractise.oop;
//WAP to print the multiplication table of a number using a function printMultiplication(int inputNumber)

import java.util.Scanner;

public class Que14 {

  static   void printMultiplication(int inputNumber){

        for(int i=1;i<=10;i++){
            System.out.println( inputNumber +" * " + i + "=" + (inputNumber*i) );
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print multiplication table of:");
        int number = scanner.nextInt();

        printMultiplication(number);


    }

}
