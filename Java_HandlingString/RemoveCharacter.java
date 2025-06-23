package Java_HandlingString;
import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char remove = sc.nextLine().charAt(0);
        String result = "";
        for (char c : str.toCharArray())
            if (c != remove) result += c;
        System.out.println("Modified String: " + result);
    }
}
