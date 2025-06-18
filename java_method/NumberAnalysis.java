import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        System.out.println("\nNumber Analysis:");
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last element (" + numbers[0] + " vs " + numbers[4] + "): ");
        if (comparison == 0) {
            System.out.println("They are equal.");
        } else if (comparison == 1) {
            System.out.println("First element is greater.");
        } else {
            System.out.println("First element is less.");
        }
    }
}
