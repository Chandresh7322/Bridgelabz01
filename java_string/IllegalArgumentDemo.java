import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException");
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text) {
        try {
            System.out.println("Handling IllegalArgumentException");
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
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
