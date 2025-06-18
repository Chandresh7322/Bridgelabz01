import java.util.Scanner;

public class SplitWordsWithLengths {

    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int count = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                words[count++] = word;
                word = "";
            }
        }
        if (!word.isEmpty()) {
            words[count++] = word;
        }
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public static int stringLength(String s) {
        int len = 0;
        try {
            while(true) {
                s.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
            return len;
        }
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordsWithLen = wordWithLengths(words);

        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (String[] row : wordsWithLen) {
            System.out.printf("%-15s %-10d\n", row[0], Integer.parseInt(row[1]));
        }
        sc.close();
    }
}
