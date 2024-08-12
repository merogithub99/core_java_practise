package functionPractise.oop;

import java.util.Arrays;

//Write a program in java  to swap two numbers using a function.
public class Que34 {

   static int[] swapToNumbers(int a, int b){
       int num1=b;
       int num2=a;

       int[] arr={num1,num2};
       return arr;


    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapToNumbers(45, 42)));

    }
}
