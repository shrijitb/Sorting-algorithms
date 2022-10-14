import java.util.ArrayList;

public class Main {
    private static final int NUM_TRIALS = 100;

    public static void main(String[] args) {
        ArrayList<Sorter> sorters = new ArrayList<>();
        sorters.add(new SelectionSort());
        sorters.add(new InsertionSort());
        sorters.add(new newSelect());
        sorters.add(new bubbleSort());


        for (Sorter sort : sorters) {
            System.out.println("------------" + sort.getName() + "-------------");
            for (int size = 2; size < 21; size += 1) {
                double time = testOnSize(sort, size, NUM_TRIALS);
                System.out.println(size + ", " + time);
            }
        }

    }

    private static double testOnSize(Sorter sort, int size, int numTrials) {
        double ellapsedTime = 0.0;

        for (int i = 0; i < numTrials; i++) {
            Comparable[] testArr = generateRandomArray(size, 10);

            long start = System.nanoTime();
            sort.sort(testArr);
            long time = System.nanoTime() - start;

            ellapsedTime += time / 1000000.0;  // convert to milliseconds
        }

        return ellapsedTime;
    }

    private static Comparable[] generateRandomArray(int size, int MAX_VAL) {
        Comparable[] out = new Comparable[size];

        for (int i = 0; i < out.length; i++) {
            out[i] = (int) (Math.random() * MAX_VAL);
        }

        return out;
    }
}
