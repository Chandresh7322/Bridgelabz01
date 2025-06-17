import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal weight";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("Height	Weight	BMI	Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f	%.2f	%.2f	%s%n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}