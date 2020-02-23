package SortAlgorithm;

public class MergeSort {
    /**
     * Idea: Dùng đệ quy sử dụng tách array ban đầu thành các array con đến khi toàn bộ các array con chỉ có một phần tử.
     *      Merge các array con lại với nhau.
     * Quy tắc merge 2 array con:
     *      +Giả sử có 2 array A[] và B[]
     *      +Tạo ra một array mới có length = A.length +B.length.
     *      +So sánh 2 phần tử đầu tiên của 2 array A và B. Phần tử nào có giá trị nhỏ hơn thì đẩy phần tử đó vào array
     *          mới tạo. tăng index của mảng có phần tử mới tạo lên 1 đơn vị và lặp lại quá trình trên.
     * Chi tiết xem tại: https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png
     *
     */
    public void mergeSort(int arr[])
    {
        if(arr.length<2) return;
        int midder = arr.length/2;
        int[] arrLeft = new int[midder];
        int[] arrRight = new int[arr.length - midder];
        //Tách arr ban đầu thành 2 array. Quá trình này được lặp lại trong hàm đệ quy.
        for (int i=0;i<midder;i++)
        {
            arrLeft[i]=arr[i];
        }

        for(int j=midder;j<arr.length;j++)
        {
            arrRight[j-midder] = arr[j];
        }
        mergeSort(arrLeft);
        mergeSort(arrRight);

        merge(arr,arrLeft,arrRight);


    }
    public void merge(int[] arrOutput, int[] arrLeft, int[] arrRight)
    {
        int i=0, j=0, k=0;
        while (i<arrLeft.length && j<arrRight.length)
        {
            if(arrLeft[i]<= arrRight[j])
            {
                arrOutput[k] = arrLeft[i];
                k++;
                i++;
            }
            else
            {
                arrOutput[k] = arrRight[j];
                k++;
                j++;
            }
        }
        while (i<arrLeft.length)
        {
            arrOutput[k] = arrLeft[i];
            k++;
            i++;
        }
        while (j<arrRight.length)
        {
            arrOutput[k] = arrRight[j];
            k++;
            j++;
        }
    }
}
