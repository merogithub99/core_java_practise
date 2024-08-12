package functionPractise.oop;
//WAP that displays all the numbers from range void display(int start , int end)

import java.util.Scanner;

public class Que10 {
   static void display(int start , int end){
        for( int i=start; i<=end;i++){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a first number to start");

        int start = scanner.nextInt();

        System.out.println("enter a end number ");


        int end = scanner.nextInt();

        display(start,end);


    }
}
