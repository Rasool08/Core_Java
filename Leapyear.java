import java.util.*;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");  // Prompt the user to enter a year
        int year = sc.nextInt();  // Read the year input from the user

        // Using the ternary operator to determine if the year is a leap year or not
        // A leap year is divisible by 4, but not divisible by 100, except when it is divisible by 400
       	//int lar=(x>y)?x:y;
		
        String ans = (year % 4 == 0 && year % 100 != 0) ? "Leap year" : (year % 400 == 0) ? "Leap year" : "Not leap year";

        System.out.println(ans);  // Print whether the input year is a leap year or not
    }
}
