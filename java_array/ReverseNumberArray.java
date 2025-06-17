import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = new int[10];
        int count = 0;

        while (number != 0) {
            digits[count++] = number % 10;
            number /= 10;
        }

        System.out.println("Reversed digits:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}