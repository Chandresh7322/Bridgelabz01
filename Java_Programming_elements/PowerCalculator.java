// Calculate power using while loop
import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power of " + power + " is " + result);
        sc.close();
    }
}