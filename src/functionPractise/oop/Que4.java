package functionPractise.oop;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of
// radius entered by the user by defining your own method.
public class Que4 {

    double AreaOfCircle(double radius,double pi){
        return pi* radius*radius;
    }
    double PerimeterOfCircle(double radius,double pi){
        return 2*pi*radius;
    }

    public static void main(String[] args) {
        double pi=3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius of the circle:");
        double radius=scanner.nextDouble();
        Que4 obj= new Que4();
        System.out.println("Area of the circle is:"+ obj.AreaOfCircle(radius,pi));
        System.out.println("Area of the circle is:"+ obj.PerimeterOfCircle(radius,pi));


    }

}
