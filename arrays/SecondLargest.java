package dsa.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 8, 40};
        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("Second largest: " + second);
    }
}
