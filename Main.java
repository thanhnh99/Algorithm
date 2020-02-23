package sortAlgorithm;

public class Main {
    /**
     * Tât cả các thuật toán được viết trên đây đều sử dụng để sort mảng theo thứ tự từ lớn đến bé.
     * @param args
     */
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        int[] test = {5, 1, 6, 2, 3, 4,7,3,4,5,6,2,7,2,7,27,2,6,1,5,7,8,9,3,4,2,4,6,7,4,5};
//        mergeSort.mergeSort(test);
//        bubbleSort.run(test);
        selectionSort.run(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + ", ");
        }
    }
}
