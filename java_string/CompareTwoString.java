import java.util.Scanner;
public class CompareTwoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = scanner.next();
        System.out.print("Enter second string: ");
        String secondString = scanner.next();
        boolean areEqualUsingCharAt = compareStringsUsingCharAt(firstString, secondString);
        boolean areEqualUsingBuiltIn = firstString.equals(secondString);
        System.out.println("Are both strings equal using charAt method? " + areEqualUsingCharAt);
        System.out.println("Are both strings equal using built-in equals method? " + areEqualUsingBuiltIn);
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}