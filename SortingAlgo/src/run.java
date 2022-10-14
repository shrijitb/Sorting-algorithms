public class run {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 2, 8, 1};
        sort(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insert = arr[i];
            int k = i-1;
            while(k>=0 && insert < arr[k]){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = insert;
            System.out.println(arr);
        }
    }
}
