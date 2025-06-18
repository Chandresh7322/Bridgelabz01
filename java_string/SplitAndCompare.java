import java.util.Scanner;

public class SplitAndCompare {

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

    public static String[] splitWordsUsingCharAt(String text) {
        int spaceCount = 0;
        for (int i = 0; i < stringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int wordStart = 0;
        int index = 0;
        for (int i = 0; i <= stringLength(text); i++) {
            if (i == stringLength(text) || text.charAt(i) == ' ') {
                String word = "";
                for (int j = wordStart; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index++] = word;
                wordStart = i + 1;
            }
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] splitCustom = splitWordsUsingCharAt(text);
        String[] splitBuiltIn = text.split(" ");

        boolean areEqual = compareStringArrays(splitCustom, splitBuiltIn);

        System.out.println("Split with custom method:");
        for (String w : splitCustom) {
            System.out.println(w);
        }

        System.out.println("Split with built-in split():");
        for (String w : splitBuiltIn) {
            System.out.println(w);
        }

        System.out.println("Are both splits equal? " + areEqual);

        sc.close();
    }
}
