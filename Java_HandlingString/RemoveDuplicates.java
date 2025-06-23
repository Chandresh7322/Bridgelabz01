package Java_HandlingString;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), result = "";
        for (char c : str.toCharArray())
            if (result.indexOf(c) == -1) result += c;
        System.out.println("Modified: " + result);
    }
}
