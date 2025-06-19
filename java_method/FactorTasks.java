import java.util.*;

public class FactorTasks {
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) if (f > max) max = f;
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static double productOfCubes(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest: " + getGreatestFactor(factors));
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Product of Cubes: " + productOfCubes(factors));
    }
}
