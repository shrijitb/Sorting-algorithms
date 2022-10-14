import java.util.ArrayList;
import java.util.Arrays;

public class AlgoTests {
    public static void main(String[] args) {
        int[] test1 = {5, 2, 5, 5, 3, 3, 3, 2, 2, 2, 6, 3, 3, 5};
        int[] test2 = {7, 3, 4, 2, 6, 9, 1, 2};
        int[] test3 = {9, 8, 7, 6, 5, 4, 3, 2};
        int[] test4 = {3};
        int[] test5 = {};

        ArrayList<int[]> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);

        for (int[] test : tests) {
            System.out.println("Before: " + Arrays.toString(test));
            test = bubbleSort(test);
            System.out.println("After: " + Arrays.toString(test));
        }

    }

    private static int[] selection(int[] arr) {
        for (int targetIndex = 0; targetIndex < arr.length; targetIndex++) {
            int targetNum = arr[targetIndex];
            int smallNumIndex = findSmallestFrom(targetIndex, arr);
            int smallestNum = arr[smallNumIndex];
            arr[targetIndex] = smallestNum;
            arr[smallNumIndex] = targetNum;
        }
      return arr;
    }

    private static int findSmallestFrom(int targetIndex, int[] arr) {
        int smallestNum = arr[targetIndex];
        int outindex = targetIndex;
        for (int i = targetIndex; i < arr.length; i++) {
            if(arr[i] < smallestNum){
                smallestNum = arr[i];
                outindex = i;
            }
        }
        return outindex;
    }

    private static int[] insertion(int[] arr){
        for (int startLoc = 1; startLoc < arr.length; startLoc++) {
            int locToInsert = startLoc;

            while( locToInsert != 0 && arr[locToInsert] < arr[locToInsert-1]) {
                int temp1 = arr[locToInsert];
                int temp2 = arr[locToInsert-1];
                arr[locToInsert] = temp2;
                arr[locToInsert-1] = temp1;
                locToInsert = locToInsert - 1;
            }
        }
        return arr;
    }

    private static int[] literallyinsertionbutbackwards(int[] arr){
        for (int startLoc = 1; startLoc < arr.length; startLoc++) {
            int locToInsert = startLoc;

            while( locToInsert != 0 && arr[locToInsert] > arr[locToInsert-1]) {
                int temp1 = arr[locToInsert];
                int temp2 = arr[locToInsert-1];
                arr[locToInsert] = temp2;
                arr[locToInsert-1] = temp1;
                locToInsert = locToInsert - 1;
            }
        }
        return arr;
    }

    private static int[] toLastLoc(int[] arr){
        int referLoc = 0;
        while (referLoc<arr.length-1){
            if(arr[referLoc]>arr[referLoc+1]){
                arr = circulateLeft(arr, referLoc);
                referLoc = 0;
            }else{
                referLoc = referLoc + 1;
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int referLoc = 0;
        while (referLoc<arr.length-1){
            if(arr[referLoc]>arr[referLoc+1]){
                swap(arr, referLoc, referLoc+1);
                referLoc = 0;
            }else{
                referLoc = referLoc + 1;
            }
        }
        return arr;
    }

    private static int[] circulateLeft(int[] arr, int referLoc) {
        int[] newArr = new int[arr.length];
        int FirstIsLast = arr[referLoc];
        int iter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != FirstIsLast){
                newArr[iter] = arr[i];
                iter++;
            }
        }
        newArr[newArr.length-1] = FirstIsLast;
        return newArr;
    }

    public static int[] newSelectsort(int[] arr) {
        for (int targetIndex = 0; targetIndex < arr.length; targetIndex++) {
            int smallNumIndex = findSmallestFrom(targetIndex, arr);
            swap(arr, smallNumIndex, targetIndex);
            int largNumIndex = findLargestFrom(targetIndex,arr);
            swap(arr, largNumIndex, arr.length-1);
        }
        int[] array = arr;
        return array;
    }

    private static int findLargestFrom(int targetIndex, int[] arr) {
        int largestNum = arr[targetIndex];
        int outindex = targetIndex;
        for (int i = targetIndex; i < arr.length; i++) {
            if(arr[i] > largestNum){
                largestNum = arr[i];
                outindex = i;
            }
        }
        return outindex;
    }
    private static void swap(int[] arr, int index1, int index2){
        int targetNum = arr[index2];
        int switcherNum = arr[index1];
        arr[index2] = switcherNum;
        arr[index1] = targetNum;
    }
}
