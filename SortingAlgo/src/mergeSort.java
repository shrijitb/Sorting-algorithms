public class mergeSort {
    public static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
    }
    public static void mergeSort(int[] arr, int start, int end, int[] tmp){
        int midIndex = (start+end)/2;
        if(start == end) return;
        mergeSort(arr, start, midIndex, tmp);
        mergeSort(arr, midIndex+1, end, tmp);
        merge(arr, start, midIndex, midIndex+1, end, tmp);
    }

    private static void merge(int[] arr, int s1, int e1, int s2, int e2, int[] tmp) {
        int leftIndex = s1; int rightIndex = s2;
        int nextLoc = s1;

        while(leftIndex <= e1 && rightIndex <= e2){
            if(arr[leftIndex]< arr[rightIndex]){
                tmp[nextLoc] = arr[leftIndex];
                leftIndex++;
            }else{
                tmp[nextLoc] = arr[rightIndex];
                rightIndex++;

            }
            nextLoc++;
        }
        while (leftIndex <= e1){
                tmp[nextLoc] = arr[leftIndex];
                leftIndex++;
                nextLoc++;
        }
        while (rightIndex <= e2){
                tmp[nextLoc] = arr[rightIndex];
                rightIndex++;
                nextLoc++;
        }
        for (int i = s1; i <= e2; i++) {
            arr[i] = tmp[i];
        }
    }
}
