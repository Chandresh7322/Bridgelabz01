import java.util.Scanner;   
public class LowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        String lowerCaseText = inputText.toLowerCase();
        String customLowerCaseText = convertToLowerCase(inputText);
        boolean areEqual = compareStrings(lowerCaseText, customLowerCaseText);
        System.out.println("Lowercase using built-in method: " + lowerCaseText);
        System.out.println("Lowercase using custom method: " + customLowerCaseText);
        System.out.println("Are both strings equal? " + areEqual);
    }

    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            result.append(c);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
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
