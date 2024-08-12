package functionPractise.oop;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeArray {
    

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sizeOfArray=scanner.nextInt();
        int[] arr= new int[sizeOfArray];
        System.out.println("Enter "+sizeOfArray+" elements for the array");
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("enter "+ i+ " index element");
            
            arr[i]= scanner.nextInt();

        }

        System.out.println("initial array is:"+Arrays.toString(arr));

        int lastElement=arr[sizeOfArray-1];

        int[] newArr=new int[sizeOfArray+1];

        if(!(lastElement==9)){
            arr[sizeOfArray-1]=arr[sizeOfArray-1]+1;

//         for(int i=0;i<size;i++){
//             newArr[i]=arr[i];
//         }
//         newArr[size]=arr[size-1]+1;
            System.out.println(Arrays.toString(arr));

        }

        if(lastElement==9){   //1,2,9
            for(int i=0;i<sizeOfArray-1;i++){
                newArr[i]=arr[i];

            }
            newArr[sizeOfArray-1]=1;
            newArr[sizeOfArray]=0;
            System.out.println("array after change:"+Arrays.toString(newArr));

        }

//       for(int num:newArr){
//           System.out.println(num);
//       }



    }
}
