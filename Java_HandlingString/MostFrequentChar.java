package Java_HandlingString;
import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replaceAll(" ", "");
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = 0;
        char ch = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                ch = c;
            }
        }
        System.out.println("Most Frequent Character: '" + ch + "'");
    }
}
