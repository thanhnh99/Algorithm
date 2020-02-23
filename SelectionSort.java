package sortAlgorithm;

public class SelectionSort {
    /**
     * Idea: +Tách mảng đã cho thành 2 phần: Sorted và UnSorted.
     *      + So sánh phần tử đầu tiên của mảng Unsorted với phần tử cuối cùng của mảng Sorted.
     *          Nếu Unsorted[0] > Sorted[length-1] thì thêm phần tử Unsorted[0] vào cuối mảng Sorted.
     *          Ngược lại: Tim vị trí thích hợp để đẩy Unsorted[0] vào Sorted[], tăng index của các phần tử đứng sau
     *          Unsorted[0] sau khi được thêm vào Sorted[] lên 1.
     *          Quá trình tiến hành đến khi Unsorted.length=0.
     */
    public void run(int[] arr)
    {
        int sizeOfArray = arr.length;
        for(int i=1;i <sizeOfArray ; i++)
        {
            if(arr[i] > arr[i-1])
            {
                continue;
            }
            else
            {
                int j=i;
                while (j>=1 && arr[j] < arr[j-1] )
                {
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }
        }
    }
}
