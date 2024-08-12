package classAndObject;

//Write a program to print the area of a rectangle by creating a class named Rectangle
// having two methods. First method named as 'setDim' takes length and breadth of the rectangle
// as parameters and the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of the rectangle are entered through the keyboard.


import java.util.Scanner;

public class RectangleDemo {
    int length;
    int breath;

    void setDim(int length , int breadth){
        this.length=length;
        this.breath=breadth;
    }

    int getArea(){
        return length*breath;

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length= scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth= scanner.nextInt();
        RectangleDemo rectangle = new RectangleDemo();
        rectangle.setDim(length,breadth);
        System.out.println("The area of the rectangle is :"+rectangle.getArea());;


    }

}
