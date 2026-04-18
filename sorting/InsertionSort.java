package dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertion(int[] arr)
    {
        int n = arr.length;
        for(int i=0 ; i<n ; i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 2, 9, 1, 3};

        int[] result = insertion(arr);
        System.out.println(Arrays.toString(result));
    }
}
