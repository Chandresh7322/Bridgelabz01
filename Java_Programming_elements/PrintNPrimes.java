// Program to print first n prime numbers
import java.util.Scanner;
public class PrintNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to print: ");
        int n = sc.nextInt();
        int count = 0, number = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }
        sc.close();
    }
}