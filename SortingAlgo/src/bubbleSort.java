public class bubbleSort implements Sorter {
    @Override
    public void sort(int[] arr) {
        int referLoc = 0;
        while (referLoc<arr.length-1){
            if(arr[referLoc]>arr[referLoc+1]){
                swap(arr, referLoc, referLoc+1);
                referLoc = 0;
            }else{
                referLoc = referLoc + 1;
            }
        }
    }
    private static void swap(int[] arr, int index1, int index2){
        int targetNum = arr[index2];
        int switcherNum = arr[index1];
        arr[index2] = switcherNum;
        arr[index1] = targetNum;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }
}
