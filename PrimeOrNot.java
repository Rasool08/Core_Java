import java.util.*;

class Num {
    // A method to check if a number is prime
    boolean isPrime(int n) {
        boolean flag = true;

        // Iterate from 2 to n-1 to check for factors
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                // If n is divisible by any number in this range, it's not prime
                flag = false;
                break;
            }
        }

        // Return true if the number is prime (flag is still true) and n is greater than 1
        return flag && n > 1;
    }
}

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read an integer from the user
        int n = sc.nextInt();

        // Create an instance of the Num class
        Num ob = new Num();

        // Check if the entered number is prime using the isPrime method
        if (ob.isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not a prime");
        }

        // Close the scanner to release resources
        sc.close();
    }
}
