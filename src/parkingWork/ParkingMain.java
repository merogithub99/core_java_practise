package parkingWork;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingMain {

    public static void main(String[] args) {
        ParkingFunction parkingFunction = new ParkingFunction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the parking space");
        int parkingSpace = scanner.nextInt();

        int[] parkingArea = new int[parkingSpace];


        boolean status = true;
        System.out.print("this is the parking space, you may choose index that have element 0:---");
        System.out.println(Arrays.toString(parkingArea));

        while (status) {
            System.out.println("Enter your choice:0---park....1-unpark 2-exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("this is the parking space, you may choose index that have 0 element");
                    System.out.println(Arrays.toString(parkingArea));
                    System.out.println("now choose the index you want to park:");
                    int parkIndex = scanner.nextInt();
                    int[] park = parkingFunction.park(parkingArea, parkIndex);
                    parkingArea[parkIndex] = 1;
//                    if (park[parkIndex] == 1) {
//                        System.out.println("successfully parked!!");
//                    }
                    System.out.println("updated parking space is:" + Arrays.toString(parkingArea));
                    break;

                case 1:
                    System.out.print("this is the current  parking space : ");
                    System.out.println(Arrays.toString(parkingArea));
                    System.out.println("which is your parking Index to unPark your vehicle:");
                    int indexToUnPark = scanner.nextInt();
                    int[] unPark = parkingFunction.unPark(parkingArea, indexToUnPark);
//                    if (unPark[indexToUnPark] == 0) {
//                        System.out.println("successfully unparked at index" + indexToUnPark);
//                    }
                    parkingArea[indexToUnPark] = 0;
                    System.out.println("the new parking space is :" + Arrays.toString(parkingArea));
                    break;

                case 2:
                    status = false;
                    break;

                default:
                    System.out.println("input valid data");
                    break;

            }
        }


    }
}
