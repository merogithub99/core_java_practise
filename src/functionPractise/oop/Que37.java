package functionPractise.oop;
//A non-empty array A of length n is called an array of all possibilities if it
// contains all numbers between 0 and A.length-1 inclusive. Write the method named
// isAllPossibilities that accepts an integer array and returns 1 if the array
// is an array of all possibilities, otherwise it returns 0.

import java.util.HashSet;

public class Que37 {

    // Method to check if an array is an array of all possibilities
    static int isAllPossibilities(int[] array) {
        int n = array.length;

        if (n == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            if (num < 0 || num >= n) {
                return 0;
            }
            set.add(num);
        }

        return set.size() == n ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {0, 2, 3};
        int[] array4 = {0, 1, 3, 4};

        System.out.println("Array1 is " + (isAllPossibilities(array1) == 1 ? "an array of all possibilities." : "not an array of all possibilities."));
        System.out.println("Array2 is " + (isAllPossibilities(array2) == 1 ? "an array of all possibilities." : "not an array of all possibilities."));
        System.out.println("Array3 is " + (isAllPossibilities(array3) == 1 ? "an array of all possibilities." : "not an array of all possibilities."));
        System.out.println("Array4 is " + (isAllPossibilities(array4) == 1 ? "an array of all possibilities." : "not an array of all possibilities."));
    }
}

