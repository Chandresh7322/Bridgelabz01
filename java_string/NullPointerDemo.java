public class NullPointerDemo {

    public static void generateException() {
        System.out.println("Generating NullPointerException");
        String text = null;
        int length = text.length();
        System.out.println("Length: " + length);
    }

    public static void handleException() {
        try {
            System.out.println("Handling NullPointerException");
            String text = null;
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
