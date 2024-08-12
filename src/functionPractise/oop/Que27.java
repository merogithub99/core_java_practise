package functionPractise.oop;

import java.util.Random;

public class Que27 {
    static int  generateRandomNumber(){

        Random random= new Random();
        return random.nextInt(0,100);
    }

    public static void main(String[] args) {
        System.out.println("the random number generated is:"+ generateRandomNumber());
    }
}
