package OOPS;
class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String cleanText = text.toLowerCase().replaceAll("\\s+", "");
        String reversed = "";
        for (int i = cleanText.length() - 1; i >= 0; i--) {
            reversed += cleanText.charAt(i);
        }
        return cleanText.equals(reversed);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "Madam";
        p.displayResult();
    }
}
