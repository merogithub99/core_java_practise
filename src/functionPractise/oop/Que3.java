package functionPractise.oop;

//Define a method that returns the product of two numbers entered by the user.

import java.util.Scanner;

public class Que3 {
    int getProduct(int n1, int n2){
        return n1*n2;

    }

    public static void main(String[] args) {
        Que3 obj= new Que3();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a first integer");
        int n1=scanner.nextInt();
        System.out.println("Enter a second integer");
        int n2=scanner.nextInt();

        System.out.println("product of two integers:"+ obj.getProduct(n1,n2));
    }

}
