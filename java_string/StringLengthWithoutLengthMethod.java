import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    public static int stringLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.next();

        int lengthCustom = stringLength(input);
        int lengthBuiltIn = input.length();

        System.out.println("Length using custom method: " + lengthCustom);
        System.out.println("Length using built-in method: " + lengthBuiltIn);

        sc.close();
    }
}
