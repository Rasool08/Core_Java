// Import the necessary Java utility package for input handling
import java.util.*;

// Define the Pangram class
class Pangram {

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object 'in' to read input from the standard input (keyboard)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        // Read a line of input from the user and store it in the 's' variable
        String s = in.nextLine();

        // Remove all spaces from the input string 's'
        s = s.replaceAll(" ", "");

        // Convert the input string to lowercase to ensure case insensitivity
        s = s.toLowerCase();

        // Initialize an empty string 'temp' to store unique letters found in the input
        String temp = "";

        // Iterate through each letter from 'a' to 'z'
        for (char i = 'a'; i <= 'z'; i++) {
            // Check if the current letter 'i' exists in the modified input string 's'
            if (s.indexOf(i) != -1) {
                // If the letter is found, append it to the 'temp' string
                temp = temp + i;
            }
        }

        // Check if the length of 'temp' is 26, indicating that all 26 English alphabet letters are present
        if (temp.length() == 26) {
            // If so, print "pangram" to the console
            System.out.println("It is a pangram");
        } else {
            // If not, print "not pangram" to the console
            System.out.println("It is not a pangram");
        }
    }
}
