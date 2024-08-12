package classAndObject;

public class RectangleService {

    double calculateArea(Rectangle rectangle){
        return rectangle.getLength()*rectangle.getBreadth();
    }

    double calculatePerimeter(Rectangle rectangle){
        return 2*(rectangle.getLength()+rectangle.getBreadth());
    }

}
