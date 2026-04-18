package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selection(int[] arr)
    {
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            int minindex = i;

            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[minindex] > arr[j]) 
                {
                    minindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 2, 9, 1, 3};

        int[] result = selection(arr);
        System.out.println(Arrays.toString(result));
    }
}
