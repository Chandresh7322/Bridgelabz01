import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static void main(String[] args) {
        int[] data = new Random().ints(1_000_000, 0, 2_000_000).toArray();
        int target = data[new Random().nextInt(data.length)];

        
        long start = System.nanoTime();
        for (int i : data) {
            if (i == target) break;
        }
        long linearTime = System.nanoTime() - start;

        
        Arrays.sort(data);
        start = System.nanoTime();
        Arrays.binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
    }
}
