package arraytask;

public class ProgramFunctions {

    public int findLargest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }


    public int findSmallest(int[] arr) {
      int smallest=arr[0];
      for(int num:arr){
          if(num<smallest){
              smallest=num;
          }
      }
      return smallest;
    }

    public int findPositiveElementCount(int[] arr) {
       int count =0;
       for(int num : arr){
           if(num>0){
               count++;
           }
       }
       return count;
    }

    public int findNegativeElementCount(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public int findSumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}