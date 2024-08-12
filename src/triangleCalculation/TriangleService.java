package triangleCalculation;

public class TriangleService {

    double area(Triangle triangle) {
        double s = (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()) / 2;
        return Math.sqrt(s * (s - triangle.getSide1()) * (s - triangle.getSide2()) * (s - triangle.getSide3()));
    }

    double perimeter(Triangle triangle) {
        return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
    }

    void kindOfTriangle(Triangle triangle) {
        double side1 = triangle.getSide1();
        double side2 = triangle.getSide2();
        double side3 = triangle.getSide3();

        if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("isosceles triangle");
        }else if((side1 == side2) && side2 == side3) {
            System.out.println("equilateral triangle");
        } else {
            System.out.println("right angle triangle");
        }

    }


}
