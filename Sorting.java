package DataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

    /*

    // Bubble sort

    public static int[] bubble(int[] arr)
    {
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=0 ; j<n-i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 2, 9, 1, 3};

        int[] result = bubble(arr);
        System.out.println(Arrays.toString(result));
    }
     */


    // Selection sort

    /*
    public static int[] selection(int[] arr)
    {
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            int minindex = i;

            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[minindex] > arr[j])  // finding the minimum element in the unsorted part
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

    */

    // Insertion sort


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
