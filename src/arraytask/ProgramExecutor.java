package arraytask;

import java.util.Scanner;

public class ProgramExecutor {

    public static void main(String[] args) {
        DataIO dataIO = new DataIO();
        ProgramFunctions programFunctions = new ProgramFunctions();
        Scanner sc= new Scanner(System.in);

        boolean status = true;
        // read array
        int[] arr = dataIO.readArray(5);

        while (status) {
            System.out.println("1 Find largest number");
            System.out.println("2 Find smallest number");
            System.out.println("3 Find count of positive elements");
            System.out.println("4 Find count of negative elements");
            System.out.println("5 Find sum of array ");
            System.out.println("6 Exit ");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int largest = programFunctions.findLargest(arr);
                    dataIO.display("Largest number: " + largest);
                    break;
                case 2:
                    int smallest = programFunctions.findSmallest(arr);
                    dataIO.display("Smallest number: " + smallest);
                    break;
                case 3:
                    int positiveCount = programFunctions.findPositiveElementCount(arr);
                    dataIO.display("Count of positive elements is: " + positiveCount);
                    break;
                case 4:
                    int negativeCount = programFunctions.findNegativeElementCount(arr);
                    dataIO.display("Count negative element: " + negativeCount);
                    break;
                case 5:
                    int sum = programFunctions.findSumOfArray(arr);
                    dataIO.display("Sum of array: " + sum);
                    break;
                case 6:
                    status = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
