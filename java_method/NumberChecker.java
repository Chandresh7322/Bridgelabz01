public class NumberChecker {
    public static void main(String[] args) {
        int num = 28;
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
