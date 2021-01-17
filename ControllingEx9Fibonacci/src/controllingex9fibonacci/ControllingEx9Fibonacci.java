package controllingex9fibonacci;

public class ControllingEx9Fibonacci {

    public static void main(String[] args) {
        printFibonacci(5);
    }

    public static void printFibonacci(int number) {
        int prev = 0;
        int cur = 1;
        int sum = 0;

        System.out.printf("Up to %d:\n", number);
        for (int i = 1; i <= number; i++) {

            System.out.printf("%d ", cur);
            sum = prev + cur;
            prev = cur;
            cur = sum;

        }

    }
}
