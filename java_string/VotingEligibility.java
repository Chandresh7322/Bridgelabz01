import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); // generate 2-digit number (0 to 89)
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Age", "Can Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-15s\n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] results = checkVotingEligibility(ages);
        displayTable(results);

        sc.close();
    }
}
