package functionPractise.oop;

//Write a program to print the factorial of a number by defining a method getFactorial(int number).

public class Que6 {

    int getFactorial(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        return  factorial;

    }


    public static void main(String[] args) {
        Que6 obj= new Que6();
        System.out.println(  obj.getFactorial(5));
    }
}
