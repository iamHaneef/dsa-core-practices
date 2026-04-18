package DataStructure.Searching;

public class LinearSearch {

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
}
