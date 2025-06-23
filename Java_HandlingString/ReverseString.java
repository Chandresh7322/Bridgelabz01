package Java_HandlingString;

public class ReverseString{
    public static void main(String[] args) {
        String s = "OK SIR ",rev = "";
        for(int i = s.length() -1; i >= 0; i--)
        rev += s.charAt(i);
        System.out.println("Reversed" +rev);
    }
    
}
