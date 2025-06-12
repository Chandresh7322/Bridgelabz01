package Java_Programming_elements;
import java.util.Scanner;

public class student_fee_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the university fee");
        double universityfee = sc.nextDouble();
        System.out.println("Enter the discount percentage");
        double discountPercent = sc.nextDouble();
        double discountAMount = (universityfee * discountPercent) / 100;
        System.out.println("The discount amount is = " + discountAMount);
        double finalFee = universityfee - discountAMount;
        System.out.println("Final fee after discount is =+ " + finalFee);
    }
}
