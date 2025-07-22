public class SearchSentence {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Python is easy",
            "C++ is fast"
        };
        String word = "easy";
        for (String s : sentences) {
            if (s.contains(word)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
