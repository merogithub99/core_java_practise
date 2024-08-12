package functionPractise.oop;
//Write a program which will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

import java.util.Scanner;

public class Que20 {

   static public void gradesChecker(int marks){
        if(marks>=91&& marks<=100){
            System.out.println("Grade:AA");
        } else if (marks>80 && marks<91) {
            System.out.println("Grade:AB");
        }else if (marks>70 && marks<81) {
            System.out.println("Grade:BB");
        }else if (marks>60 && marks<71) {
            System.out.println("Grade:BC");
        }else if (marks>50 && marks<61) {
            System.out.println("Grade:CD");
        }else if (marks>40 && marks<51) {
            System.out.println("Grade:DD");
        } else if (marks<=40 && marks>=0) {
            System.out.println("You have failed");

        }else{
            System.out.println("please inter a valid marks");
        }

    }



    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        while(true){
            System.out.println("Please enter your marks to check your grade:");
            int marks= scanner.nextInt();

            if(marks>0 && marks<=100){
                gradesChecker(marks);
               break;
            }else{
                System.out.println("please enter the valid marks(0-100)");
            }

        }


    }
}
