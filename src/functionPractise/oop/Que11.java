package functionPractise.oop;

//WAP that displays all the odd numbers from
// range void displayOddNumbers(int start , int end)

import java.util.Scanner;

public class Que11 {

    static void displayOddNumbers(int start , int end){
        for( int i=start; i<=end;i++){
           if(!(i%2==0)){
               System.out.print(i+" ");
           }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a first number to start");

        int start = scanner.nextInt();

        System.out.println("enter a end number ");

        int end = scanner.nextInt();

        displayOddNumbers(start,end);
    }
}
