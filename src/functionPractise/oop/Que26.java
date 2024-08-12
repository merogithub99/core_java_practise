package functionPractise.oop;

import java.util.Scanner;

//Write a method to find the area of a circle.
public class Que26 {
    static double areaOfCircle(double r){
        double pi=3.14;
        return pi*r*r;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value of radius of circle");
        double radius = scanner.nextDouble();

        System.out.println("the area of the circle is:"+ areaOfCircle(radius));

    }
}
