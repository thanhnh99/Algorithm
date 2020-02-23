package SortAlgorithm;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] test = {5, 1, 6, 2, 3, 4};
        mergeSort.mergeSort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + ", ");
        }
    }
}
