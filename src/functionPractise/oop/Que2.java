package functionPractise.oop;

//Write a program with a method named getTotal that accepts two integers
// as an argument and return its sum. Call this method from main( ) and print the results.

import java.util.Scanner;

public class Que2 {
    int getTotal(int n1, int n2){
        return n1+n2;

    }

    public static void main(String[] args) {
        Que2 obj= new Que2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a first integer");
        int n1=scanner.nextInt();
        System.out.println("Enter a second integer");
        int n2=scanner.nextInt();

        System.out.println("sum of two integers:"+ obj.getTotal(n1,n2));
    }

}
