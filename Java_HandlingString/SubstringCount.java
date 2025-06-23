package Java_HandlingString;
import java.util.Scanner;
public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++; index++;
        }
        System.out.println("Occurrences: " + count);
    }
}
