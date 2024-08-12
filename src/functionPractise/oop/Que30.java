package functionPractise.oop;

import java.util.Scanner;

public class Que30 {
//    Write a Java method to check whether a string is a valid password
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits.

    static boolean isValidPassword(String password){
        if(password.length()<10){
            return false;
        }
        int countdigit=0;

        for(int i=0;i<password.length();i++){
            char ch= password.charAt(i);

            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isDigit(ch)){
                countdigit++;

            }
        }
        return countdigit >= 2;

    }



    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a password to check its validation");
        String password= scanner.nextLine();
        System.out.println(isValidPassword(password));


    }
}
