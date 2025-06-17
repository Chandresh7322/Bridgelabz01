import java.util.Scanner;

public class DigitLargestSecondLimited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number != 0 && index < maxDigits) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
    }
}