import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multiplicationResult[j] = number * i;
            System.out.println(number + " * " + i + " = " + multiplicationResult[j]);
        }
    }
}