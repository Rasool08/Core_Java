import java.util.Arrays;
import java.util.Scanner;

class StrBuffer {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s = in.nextLine();
        System.out.println("Enter the second string:");
        String s1 = in.nextLine();

        // Remove spaces and convert to lowercase for accurate comparison
        s = s.replaceAll("\\s", "").toLowerCase();
        s1 = s1.replaceAll("\\s", "").toLowerCase();

        // Check if the sorted character arrays are equal
        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

        if (Arrays.equals(c, c1)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Anagram not found");
        }
    }
}


//how to reverse string
//String s="hello";
//StringBuffer s1=new StringBuffer(s);
