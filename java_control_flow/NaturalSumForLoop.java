import java.util.Scanner;

public class NaturalSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct and match.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }
    }
}
