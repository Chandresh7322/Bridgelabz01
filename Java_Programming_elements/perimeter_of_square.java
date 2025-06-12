package Java_Programming_elements;
import java.util.Scanner;
public class perimeter_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the side of the square:");
        int sideLength = sc.nextInt();
        int perimeter = 4* sideLength;
        System.out.println("The perimeter of the square with side length " + sideLength + " is: " + perimeter);
        sc.close();
    }
    
}
