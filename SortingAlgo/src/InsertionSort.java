public class InsertionSort implements Sorter{
    Comparable[] array;
    public InsertionSort() {

    }
    public void sort(Comparable[] arr){
        for (int startLoc = 1; startLoc < arr.length; startLoc++) {
            int locToInsert = startLoc;

            while( locToInsert != 0 && arr[locToInsert].compareTo(arr[locToInsert-1]) < 0) {
                Comparable temp1 = arr[locToInsert];
                Comparable temp2 = arr[locToInsert-1];
                arr[locToInsert] = temp2;
                arr[locToInsert-1] = temp1;
                locToInsert = locToInsert - 1;
            }
        }
        array = arr;
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }
}
