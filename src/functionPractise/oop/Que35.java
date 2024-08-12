package functionPractise.oop;
//Write a program in java to find the sum of the series 1!/1+2!/2+3!/3+4!/4+5!/5 using the function.


public class Que35 {


    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static double calculateSeriesSum(int terms) {
        double sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum += (double) factorial(i) / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int terms = 5;
        double seriesSum = calculateSeriesSum(terms);
        System.out.println("The sum of the series is: " + seriesSum);
    }
}
