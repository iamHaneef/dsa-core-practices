package core_java;

public class ExceptionHandling {
    public static void main(String[] args) {
        int amount = 500;

        try {
            int total = 1000;
            if (amount != total) {
                throw new Exception("Balance mismatch error");
            }
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction operation finished.");
        }
    }
}
