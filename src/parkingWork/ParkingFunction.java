package parkingWork;

import java.util.Arrays;

public class ParkingFunction {


    public int[] park(int[] parkingSpace,int parkingIndex){

        if(parkingSpace[parkingIndex]==1){
            System.out.println("sorry you are not able to park :this park index is full  !!!");
        }else{
            parkingSpace[parkingIndex]=1;
            System.out.println("your vehicle is parked at parkingiIndex ( "+parkingIndex +" )successfully");

            System.out.println(Arrays.toString(parkingSpace));
        }



        return parkingSpace;


    }

    public int[] unPark(int[] parkingSpace,int indexToUnPark){
        if(parkingSpace[indexToUnPark]==0){
            System.out.println("this cannot be your parking index, that is already empty");
        }else{
            parkingSpace[indexToUnPark]=1;
            System.out.println("you have successfully unParked your vehicle at index : "+ indexToUnPark);
        }

       return  parkingSpace;
    }




}
