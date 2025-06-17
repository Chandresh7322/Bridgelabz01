import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
                weight = scanner.nextDouble();
            } while (weight <= 0);

            do {
                System.out.print("Enter height of person " + (i + 1) + " in meters: ");
                height = scanner.nextDouble();
            } while (height <= 0);

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal weight";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("Height	Weight	BMI		Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f	%.2f	%.2f	%s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}