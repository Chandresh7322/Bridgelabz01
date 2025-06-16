// Program to print even numbers only from 1 to n
import java.util.Scanner;
public class EvenNumbersOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Even numbers from 1 to " + n + " are:");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i);
            }
        }
        sc.close();
    }
}