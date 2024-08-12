package functionPractise.oop;
//WAP that displays all the prime numbers between 1 and 1000.
// Use the above checkPrime function to identify the prime number.
public class Que13 {

    public static void main(String[] args) {

        for(int i=0; i<=1000;i++){
            if( Que12.checkPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
