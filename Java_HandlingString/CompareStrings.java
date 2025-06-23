package Java_HandlingString;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int minLen = Math.min(s1.length(), s2.length());
        boolean found = false;
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                found = true;
                System.out.println(s1.charAt(i) < s2.charAt(i) ? s1 + " comes before " + s2 : s2 + " comes before " + s1);
                break;
            }
        }
        if (!found)
            System.out.println(s1.length() < s2.length() ? s1 + " comes before " + s2 : s1.equals(s2) ? "Strings are equal" : s2 + " comes before " + s1);
    }
}
