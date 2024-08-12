package functionPractise.oop;

//Create a function called sum(int num1 , int num2 , int num3)  and
// inside the function return the sum of three numbers and display
// it in the part from where the function was called.

public class Que8 {
    int sum(int num1, int num2, int num3){

        return num1+num2+num3;
    }

    public static void main(String[] args) {
        Que8 obj = new Que8();
        System.out.println(obj.sum(1,2,3));
    }



}
