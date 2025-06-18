import java.util.Scanner;

public class VowelsConsonantsChecker {

    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findCharTypes(String text) {
        int len = text.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = charType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-12s\n", "Character", "Type");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-12s\n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] results = findCharTypes(text);
        displayTable(results);

        sc.close();
    }
}
