import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        List<Integer> factors = new ArrayList<>();
        int sum = 0, sumOfSquares = 0, product = 1;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
                sum += i;
                sumOfSquares += Math.pow(i, 2);
                product *= i;
            }
        }

        System.out.println("Factors: " + factors);
        System.out.println("Sum: " + sum);
        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Product: " + product);
    }
}
