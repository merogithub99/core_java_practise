package functionPractise.oop;

import java.util.Scanner;

//In main() method accept a string from the user and count the number of vowels in that string.
public class Que23 {

    public static void main(String[] args) {
        int count =0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a string");
        String str=scanner.nextLine();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
               count++;
           }
        }
        System.out.println("the number of vowels in the string:"+count);

    }
}
