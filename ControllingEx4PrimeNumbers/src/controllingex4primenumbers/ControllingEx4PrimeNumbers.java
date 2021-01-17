
package controllingex4primenumbers;


public class ControllingEx4PrimeNumbers {


    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean prime = true;
            if(i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    prime = false;
                }
            }
            
            if(prime) {
                System.out.printf("The number %d is prime\n", i);
            }
        }
        
        
    }
}
