package functionPractise.oop;

//Create a function called averageNumber(int num1 , int num2 , int num3)
// and inside the function display the highest and lowest among three numbers.

import java.util.Scanner;

public class Que7 {

    static  void averageNumber(int num1 , int num2 , int num3){
        if(num1<num2 && num1<num3){
            System.out.println("num1 is smallest");
        }else if (num2<num1 && num2<num3){
            System.out.println("num2 is smallest");
        }else {
            System.out.println("num3 is smallest");
        }

        if(num1>num2 && num1>num3){
            System.out.println("num1 is largest");
        }else if (num2>num1 && num2>num3){
            System.out.println("num2 is largest");
        }else {
            System.out.println("num3 is largest");
        }


    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number");
        int num1= scanner.nextInt();
        System.out.println("enter second number");
        int num2= scanner.nextInt();
        System.out.println("enter third number");
        int num3= scanner.nextInt();

        averageNumber(num1,num2,num3);

    }
}
