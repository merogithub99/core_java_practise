package functionPractise.oop;

//WAP that check a prime number boolean checkPrime(int testNumber)


import java.util.Scanner;

public class Que12 {

   static boolean checkPrime(int testNumber){
        if(testNumber<=1){
            return false;
        }
        if(testNumber==2){
            return true;
        }

        if(testNumber%2==0){
            return  false;
        }

        for(int i=3;i<=Math.sqrt(testNumber);i+=2){
            if(testNumber%i==0){
                return  false;
            }
        }
        return true;




    }

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        boolean status= true;


        while(status){
            System.out.println("you want to test:  yes or no");
            scanner.nextLine();
            String decision= scanner.nextLine();

            if(decision.equalsIgnoreCase("no")){
                status=false;
            }else{
                System.out.println("enter a number to check whether it's prime or not");
                int number = scanner.nextInt();

                System.out.println("this number is prime??" + checkPrime( number));
            }


        }


    }
}
