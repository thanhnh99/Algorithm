package sortAlgorithm;

public class BubbleSort
{
    /**
     * ideo: swap từ  đầu hai phần tử đứng cạnh nhau sao cho đúng thứ tự.
     *      +Qua mỗi lần lặp (lặp lặp c ácạiswap) thì sẽ có 1 phần tử đứng đúng vị trí ở cuối.
     *      +Giảm dần arrSize để không lặp lại đến chỗ phần tử đã đứng đúng chỗ.
     * @param arr
     */
    public void run(int[] arr)
    {
        int arrSize = arr.length;
        for(int i = 0; i < arrSize-1; i++)
        {
            for(int j = 0; j < arrSize-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
