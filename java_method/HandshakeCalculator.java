import java.util.Scanner;

public class HandshakeCalculator {
      public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for a handshake.");
            return;
        }
         int handshakes = calculateHandshakes(numberOfStudents);
         System.out.println("The maximum number of possible handshakes is: " + handshakes);
    }
}
