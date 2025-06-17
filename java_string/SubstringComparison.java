import java.util.Scanner;
public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        System.out.print("Enter start index for substring: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter end index for substring: ");
        int endIndex = scanner.nextInt();
        
        String customSubstring = createSubstring(inputText, startIndex, endIndex);
        String builtInSubstring = inputText.substring(startIndex, endIndex);
        
        boolean areEqual = compareStrings(customSubstring, builtInSubstring);
        
        System.out.println("Custom substring using charAt(): " + customSubstring);
        System.out.println("Built-in substring method: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
    }
    
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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
