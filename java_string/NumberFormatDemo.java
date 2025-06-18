import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        System.out.println("Trying to convert text to number");
        int number = Integer.parseInt(text);
        System.out.println("Number is " + number);
    }

    public static void handleException(String text) {
        try {
            System.out.println("Trying to handle exception");
            int number = Integer.parseInt(text);
            System.out.println("Number is " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text input");
        String input = sc.next();

        generateException(input);
        handleException(input);

        sc.close();
    }
}
