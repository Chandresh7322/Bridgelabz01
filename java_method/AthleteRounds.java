import java.util.Scanner;

public class AthleteRounds {

    // Method to compute the number of rounds needed
    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c; // in meters
        double distanceToRun = 5000.0; // 5 km in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side A (meters): ");
        double a = scanner.nextDouble();
        System.out.print("Enter side B (meters): ");
        double b = scanner.nextDouble();
        System.out.print("Enter side C (meters): ");
        double c = scanner.nextDouble();

        double rounds = computeRounds(a, b, c);
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.\n", rounds);
    }
}
