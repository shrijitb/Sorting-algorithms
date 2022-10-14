public class newSelect implements Sorter {
    int[] array;
    @Override
    public void sort(int[] arr) {
        for (int targetIndex = 0; targetIndex < arr.length; targetIndex++) {
            int smallNumIndex = findSmallestFrom(targetIndex, arr);
            swap(arr, smallNumIndex, targetIndex);
            int largNumIndex = findLargestFrom(targetIndex,arr);
            swap(arr, largNumIndex, arr.length-1);
        }
        array = arr;
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

    @Override
    public String getName() {
        return "New Selection Method";
    }
}
