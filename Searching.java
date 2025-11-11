package DataStructure;

public class Searching {

    /*

    // linear search :
    public static int linear(int[] arr , int key)
    {
        for(int i=0 ; i < arr.length ; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {5,2,8,7,1};
        int key = 7;


        int ans = linear(arr,key);
        if(ans != -1)
        {
            System.out.println(ans + " is a searching index");
        }
        else {
            System.out.println("Not found");
        }
    }


     */

    // binary search :

    //linear search :

    public static int binary(int[] arr , int key)
    {
        int l = 0;
        int r = arr.length-1;

        while (l<=r)
        {
            int mid = (l+r) / 2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                l = mid + 1;
            }
            else if (arr[mid] > key)
            {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,3,5,7,9,11};
        int key = 3;

        int ans = binary(arr,key);
        if(ans != -1)
        {
            System.out.println(ans + " is a searching index");
        }
        else {
            System.out.println("Not found");
        }
    }

}
