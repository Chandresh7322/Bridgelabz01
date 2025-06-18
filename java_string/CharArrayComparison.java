import java.util.Scanner;

public class CharArrayComparison {

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = sc.next();

        char[] manualChars = getCharacters(input);
        char[] builtinChars = input.toCharArray();

        boolean isEqual = compareCharArrays(manualChars, builtinChars);

        System.out.println("User-defined char array:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in toCharArray result:");
        for (char c : builtinChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal: " + isEqual);

        sc.close();
    }
}
