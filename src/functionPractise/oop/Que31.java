package functionPractise.oop;
//Write Java methods to calculate the area of a triangle.
//Expected Output:
//Input Side-1: 10
//Input Side-2: 15
//Input Side-3: 20
//The area of the triangle is 72.6184377413890

public class Que31 {
   static double findAreaOfTriangle(double a, double b, double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }

    public static void main(String[] args) {

        System.out.println(findAreaOfTriangle(10,15,20));

    }
}
