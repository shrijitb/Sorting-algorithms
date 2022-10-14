public class SelectionSort implements Sorter{
    /*
    int[] array;
    public SelectionSort() {
    }

    @Override
    public void sort(int[] arr) {
        for (int targetIndex = 0; targetIndex < arr.length; targetIndex++) {
            int targetNum = arr[targetIndex];
            int smallNumIndex = findSmallestFrom(targetIndex, arr);
            int smallestNum = arr[smallNumIndex];
            arr[targetIndex] = smallestNum;
            arr[smallNumIndex] = targetNum;
        }
        array = arr;
    }

    @Override
    public String getName() {
        return "Selection Sort";
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
}
