package triangleCalculation;

import java.util.Scanner;

public class TriangleIO {
    Scanner scanner = new Scanner(System.in);

    public Triangle readTriangle() {
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1,side2,side3);
        return triangle;
    }




}
