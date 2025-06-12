import java.util.Scanner;
public class height_converter {
    public static void main(String[]args) {
        double heightcm;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in centimeters");
        heightcm = input.nextDouble(); 

        double totalInches = heightcm / 2.54;
        double feet = totalInches / 12;
        double inches = totalInches % 12;

        System.out.println("hieght in Inches" + totalInches + "height in feet " + feet + "and inches");
    }
    
}