import java.util.Scanner;

public class ArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Compare first and last elements
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("First element is smaller.");
        } else {
            System.out.println("First and last elements are equal.");
        }
    }
}
