package method;

import java.util.Scanner;

public class Calculation {
    float getArea(float l, float b) {
        return l * b;
    }

    float getVolume(float l, float b, float h) {
        return getArea(l, b) * h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        float length = scanner.nextFloat();
        System.out.println("enter breadth");
        float breadth = scanner.nextFloat();
        System.out.println("enter height");
        float height = scanner.nextFloat();

        Calculation calculation = new Calculation();

        System.out.println(calculation.getArea(length,breadth));;
        System.out.println(calculation.getVolume(length,breadth,height));

    }
}
