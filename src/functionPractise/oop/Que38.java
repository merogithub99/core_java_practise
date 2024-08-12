package functionPractise.oop;
/*Write a program in java to check whether two given strings are an anagram.
Test Data :
Input the first String : spare
Input the second String : pears
Expected Output :
spare and pears are Anagram. */

// heart=====earth

import java.util.Arrays;
import java.util.Scanner;

public class Que38 {

   static boolean checkAnagram(String s1, String s2){

       if(s1.length()!=s2.length()){
           return false;
       }

       char[] array1=s1.toCharArray();
       char[] array2=s2.toCharArray();

       Arrays.sort(array1);
       Arrays.sort(array2);


       return Arrays.equals(array1, array2);
   }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string first :");
        String s1=scanner.nextLine();
        System.out.println("Enter a string second :");
        String s2=scanner.nextLine();

        System.out.println(s1 + " and "+ s2 + " :are  anagram??"+ checkAnagram(s1,s2));


    }
}
