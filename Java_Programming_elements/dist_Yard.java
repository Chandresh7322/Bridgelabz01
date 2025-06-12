package Java_Programming_elements;
import java.util.Scanner;
class dist_Yard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet:");
        double feet = sc.nextDouble();
        double yards = feet /3;
        System.out.println("THe distance in yards is" + yards);
        sc.close();
    }
    
}
