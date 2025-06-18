import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println("Accessing invalid index of string");
        char ch = text.charAt(100);
        System.out.println("Character: " + ch);
    }

    public static void handleException(String text) {
        try {
            System.out.println("Handling exception while accessing string");
            char ch = text.charAt(100);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = sc.next();

        generateException(input);
        handleException(input);

        sc.close();
    }
}
