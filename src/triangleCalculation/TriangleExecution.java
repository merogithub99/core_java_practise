package triangleCalculation;

public class TriangleExecution {


    public static void main(String[] args) {
        TriangleIO triangleIO = new TriangleIO();
        TriangleService triangleService = new TriangleService();
        System.out.println("enter the value of three sides of triangle:");
        Triangle triangle = triangleIO.readTriangle();
        double area = triangleService.area(triangle);
        System.out.println("area of the triangle is:"+area);
        double perimeter = triangleService.perimeter(triangle);
        System.out.println("perimeter of triangle is:"+perimeter);
        triangleService.kindOfTriangle(triangle);
    }
}
