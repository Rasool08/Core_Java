// Import the necessary Java utility package for input handling
import java.util.*;

// Define the Percent class
class Percent {

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object 'in' to read input from the standard input (keyboard)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of times the initial amount to be discounted:");
        // Read the number of times the initial amount will be discounted ('n') from user input
        int n = in.nextInt();
        System.out.println("Enter the initial amount");
        // Read the initial amount ('c') from user input
        int c = in.nextInt();

        // Initialize a 'double' variable 'res' with the initial amount 'c'
        double res = c;

        // Enter a loop that runs 'n' times
        for (int i = 1; i <= n; i++) {
            // Apply a 10% discount by multiplying 'res' by 0.9
            res = res * 0.9;
        }

        // Print the final discounted value 'res' to the console
        System.out.print(res);
    }
}


