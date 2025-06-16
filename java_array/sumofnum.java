package java_array;
import java.util.Scanner;
public class sumofnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of the entered numbers: " + sum);
    }
}