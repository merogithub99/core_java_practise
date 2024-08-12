package functionPractise.oop;

//An array is called balanced if it’s even number elements (a[0],a[2],etc.) are even and
// its odd numbered elements (a[1],a[3],etc.) are odd. Write a function named Balanced
// that accepts an array of integers and returns 1 if the array is balanced otherwise it returns 0.


public class Que40 {

   static boolean balancedArray(int[] arr){

        for (int i=0;i<arr.length;i+=2){
            if(arr[i]%2==0 && arr[i+1]%2!=0){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
       int[] arr={0,1,9,3,4,5,455};

        System.out.println(balancedArray(arr));


    }
}
