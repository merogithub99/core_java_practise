package functionPractise.oop;
//Write a method to find factorial using recursion.
public class Que24 {

     static int factorial(int number){
        if(number<=0){
            return 1;
        }
        return number * factorial(number-1);

    }

    public static void main(String[] args) {
        System.out.println("the factorial of 5 is:"+factorial(5));
    }
}
