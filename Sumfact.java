import java.util.*;

public class Sumfact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a positive integer: ");
        
        // Read an integer from the user
        int n = sc.nextInt();
        
        // Initialize a variable to store the sum of factors
        int sum = 0;
        
        // Iterate through numbers from 1 to n to find factors
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // If i is a factor, add it to the sum
                sum = sum + i;
            }
        }
        
        // Print the sum of factors
        System.out.println("The sum of factors of " + n + " is: " + sum);
        
        // Close the scanner to release resources
        sc.close();
    }
}
