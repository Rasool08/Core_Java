import java.util.Scanner;

public class ArmLimit {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        // Store the original number for comparison
        int originalNum = num;
        
        // Calculate the number of digits in the number
        int numDigits = String.valueOf(num).length();
        
        // Initialize the sum variable
        int sum = 0;

        // Extract digits one by one and calculate the sum of their powers
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += Math.pow(digit, numDigits);  // Add the digit raised to the power of numDigits to the sum
            num /= 10;  // Remove the last digit
        }

        // Check if the calculated sum is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Armstrong numbers in the range " + lowerLimit + " to " + upperLimit + ":");

        // Iterate through the numbers within the specified range
        for (int i = lowerLimit; i <= upperLimit; i++) {
            // Check if the current number is an Armstrong number
            if (isArmstrong(i)) {
                System.out.print(i + " ");  // Print the Armstrong number
            }
        }
    }
}
