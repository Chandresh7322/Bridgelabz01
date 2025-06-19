import java.util.Scanner;

public class NumberGuessing {
    static int guess(int low, int high) {
        return (low + high) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int mid = guess(low, high);
            System.out.println("Is your number " + mid + "? (high/low/correct): ");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) break;
            else if (feedback.equalsIgnoreCase("high")) high = mid - 1;
            else if (feedback.equalsIgnoreCase("low")) low = mid + 1;
        }

        System.out.println("Yay! Guessed it.");
        sc.close();
    }
}
