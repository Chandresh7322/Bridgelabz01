import java.io.*;

public class CountWord {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String word = "Java";
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.equals(word)) count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}
