import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        
        scanner.nextLine(); 
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        generateException(names);
        handleArrayIndexOutOfBoundsException(names);
        
        scanner.close();
    }
    
    public static void generateException(String[] names) {
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
    }
    
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println("Accessing index " + (names.length + 1) + ": " + names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }
}