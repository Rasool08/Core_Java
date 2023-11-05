import java.util.Scanner;

class Fibonacci {
    // Recursive function to calculate the nth Fibonacci number
    static int f(int n) {
        if (n <= 1) {
            return n;  // Base case: Return 0 for n=0 and 1 for n=1
        }
        // Recursive case: Calculate the nth Fibonacci number using the sum of the previous two numbers
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = in.nextInt();  // Read an integer n from the user

        // Call the function f with n as an argument and print the result
        System.out.println(f(n));  // Function with argument and return
    }
}
