package classAndObject;

import triangleCalculation.Triangle;

import java.util.Scanner;

public class RectangleIO {

    Scanner scanner = new Scanner(System.in);


    public  Rectangle readInput(){
        System.out.println("enter the length:");
        double length= scanner.nextDouble();
        System.out.println("enter the breadth:");
        double breadth=scanner.nextDouble();

        Rectangle rectangle= new Rectangle(length,breadth);
        return  rectangle;

    }


}
