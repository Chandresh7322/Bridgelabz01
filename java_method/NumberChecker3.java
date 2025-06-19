import java.util.Arrays;

public class NumberChecker3 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverseArray(digits);
        return areArraysEqual(digits, rev);
    }

    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static void main(String[] args) {
        int num = 12021;

        System.out.println("Digits: " + Arrays.toString(getDigits(num)));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(getDigits(num))));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
    }
}
