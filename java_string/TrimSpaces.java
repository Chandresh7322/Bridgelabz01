import java.util.Scanner;

public class TrimSpaces {

    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedUser = substringUsingCharAt(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Trimmed using charAt: '" + trimmedUser + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedBuiltIn + "'");

        boolean isEqual = compareStrings(trimmedUser, trimmedBuiltIn);
        System.out.println("Are both trimmed strings equal? " + isEqual);

        sc.close();
    }
}
