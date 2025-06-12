package Java_Programming_elements;
import java.util.Scanner;
public class cal_Totalprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the unit price");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total price for " + quantity + " units at a unit price of " + unitPrice + " is: " + totalPrice);

    }
    
}
