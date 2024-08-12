package functionPractise.oop;
//Create a function that returns true when both the parameters are equal else return false. isSameNum(4, 8) ➞ false

public class Que17 {
    static  boolean isSameNum(int num1, int num2){
        return num1 == num2;
    }

    public static void main(String[] args) {
        System.out.println(isSameNum(5,6));
    }
}
