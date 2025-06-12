package Java_Programming_elements;
import java.util.Scanner;

class km_to_miles {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();

        miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
