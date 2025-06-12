package Java_Programming_elements;
import java.util.Scanner;
public class area_of_traingle {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of the triangle:");
    int base = sc.nextInt();
    System.out.println("ENter the height of the traingle");
    int height = sc.nextInt();
    double area = 0.5 * base * height;
    System.out.println("THe area of the traingle with base " + base + " and height " + height + " is: " + area);
    sc.close();
    }
}
    
    

