import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void generateException(String[] names) {
        System.out.println("Trying to access an invalid index");
        System.out.println(names[10]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Trying to handle exception");
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
        }

        generateException(names);
        handleException(names);

        sc.close();
    }
}
