import java.util.Scanner;

public class WordLengthAnalysis {

    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (word.length() > 0) {
                words[wordCount] = word;
                wordCount++;
                word = "";
            }
        }
        if (word.length() > 0) {
            words[wordCount] = word;
            wordCount++;
        }

        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

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

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordsWithLen) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 0; i < wordsWithLen.length; i++) {
            int len = Integer.parseInt(wordsWithLen[i][1]);
            if (len < shortest) {
                shortest = len;
                shortestIndex = i;
            }
            if (len > longest) {
                longest = len;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordsWithLen = wordWithLengths(words);
        int[] indexes = findShortestAndLongest(wordsWithLen);

        System.out.println("Words and their lengths:");
        for (int i = 0; i < wordsWithLen.length; i++) {
            System.out.println(wordsWithLen[i][0] + " : " + wordsWithLen[i][1]);
        }

        System.out.println("Shortest word: " + wordsWithLen[indexes[0]][0]);
        System.out.println("Longest word: " + wordsWithLen[indexes[1]][0]);

        sc.close();
    }
}
