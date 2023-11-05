import java.util.Scanner;

class Dupstr {
    // Recursive method to find permutations of a string
    static void permutation(String in, String ans) {
        // If the input string is empty, print the answer
        if (in.length() == 0) {
            System.out.println(ans);
            return; // Return without a return statement here, used to backtrack
        }

        // Iterate through each character of the input string
        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);  // Current character
            String lss = in.substring(0, i);  // Left substring
            String rss = in.substring(i + 1);  // Right substring
            String pss = lss + rss;  // Remaining characters after removing 'ch'

            // Recursively call the permutation function with the updated input and answer
            permutation(pss, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.println("Enter a string:");
        String s = in.next();  // Read a string from the user
	
        // Call the permutation method with the input string and an empty initial answer
        permutation(s, "");  // Function with two arguments without return
    }
}

