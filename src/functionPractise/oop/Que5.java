package functionPractise.oop;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.


import java.util.Scanner;

public class Que5 {

    boolean isEligibleToVote(int age){
        return age >= 18;
    }


    public static void main(String[] args) {
        Que5 obj= new Que5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        if(obj.isEligibleToVote(age)){
            System.out.println("you are allowed to vote");
        }else{
            System.out.println("your age is not valid to vote");
        }


    }
}
