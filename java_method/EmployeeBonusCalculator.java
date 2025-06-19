import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random old salaries and years of service
    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Salary between 10000 to 99999
            data[i][1] = rand.nextInt(11); // Years of service between 0 to 10
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to print tabular output and total sums
    public static void displayData(int[][] employeeData, double[][] newSalaryData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-5s %-10s %-10s %-10s %-12s\n", "Emp", "OldSal", "Yrs", "Bonus", "NewSal");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSal = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = newSalaryData[i][0];
            double newSal = newSalaryData[i][1];
            totalOldSalary += oldSal;
            totalBonus += bonus;
            totalNewSalary += newSal;
            System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f\n", i + 1, oldSal, years, bonus, newSal);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] newSalaryData = calculateBonusAndNewSalary(employeeData);
        displayData(employeeData, newSalaryData);
    }
}
