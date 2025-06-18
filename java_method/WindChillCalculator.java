import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        if (windSpeed < 3 || temperature > 50) {
            System.out.println("Wind chill not defined for these values.");
            return Double.NaN;
        }
        return 35.74 + 0.6215 * temperature 
               - 35.75 * Math.pow(windSpeed, 0.16) 
               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature (in °F): ");
        double temp = scanner.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double wind = scanner.nextDouble();

        double windChill = calculateWindChill(temp, wind);
        if (!Double.isNaN(windChill)) {
            System.out.printf("Wind Chill Temperature: %.2f°F\n", windChill);
        }
    }
}
