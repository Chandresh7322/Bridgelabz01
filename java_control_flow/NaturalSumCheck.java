import java.util.Scanner;

public class NaturalSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct and match.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }
    }
}
