import java.util.Scanner;

public class ArmLimit {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = sc.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = sc.nextInt();

        System.out.println("Armstrong numbers in the range " + lowerLimit + " to " + upperLimit + ":");

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
