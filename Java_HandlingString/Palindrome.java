package Java_HandlingString;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam", r = "";
        for(int i = s.length() - 1; i >= 0; i--)
        r += s.charAt(i);
        System.out.println(s.equals(r) ? "Palindrome" : "Not Palindrome"); 
    }
    
}
