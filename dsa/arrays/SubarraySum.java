package dsa.arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;

        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
            if (currentSum == s) {
                System.out.println("Sum found at index " + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
                    if (currentSum == s) {
                        System.out.println("Sum found between indexes " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
    }
}
