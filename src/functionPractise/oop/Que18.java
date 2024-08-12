package functionPractise.oop;

//Define two methods to print the maximum and minimum number respectively among three numbers entered by the user.

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Que18 {
    static int maximumNumberCheck(int a,int b, int c){
        int max= Math.max(a,b);
        return Math.max(max, c);
    }
    static int minimumNumberCheck(int a,int b, int c){
        int min= Math.min(a,b);
        return Math.min(min, c);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        System.out.println("enter third number");
        int num3=sc.nextInt();

        System.out.println("max among three is:"+ maximumNumberCheck(num1,num2,num3));
        System.out.println("min among three is:"+ minimumNumberCheck(num1,num2,num3));
    }


}
