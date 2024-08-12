package classAndObject;

public class RectangleMain {

    public static void main(String[] args) {

        RectangleIO rectangleIO = new RectangleIO();
        RectangleService rectangleService = new RectangleService();
        Rectangle rectangle =rectangleIO.readInput();
        System.out.println("area of the rectangle is:" +rectangleService.calculateArea(rectangle));;
        System.out.println("perimeter of the rectangle is:"+ rectangleService.calculatePerimeter(rectangle));;

    }
}
