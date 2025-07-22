import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
