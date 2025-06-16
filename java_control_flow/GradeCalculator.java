
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        System.out.println("Average Mark: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A | Remarks: Excellent");
        } else if (percentage >= 80) {
            System.out.println("Grade: B | Remarks: Very Good");
        } else if (percentage >= 70) {
            System.out.println("Grade: C | Remarks: Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: D | Remarks: Satisfactory");
        } else {
            System.out.println("Grade: F | Remarks: Needs Improvement");
        }
    }
}
