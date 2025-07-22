import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int[] data = new Random().ints(10_000).toArray();

        
        int[] bubbleData = data.clone();
        long start = System.nanoTime();
        for (int i = 0; i < bubbleData.length; i++) {
            for (int j = 0; j < bubbleData.length - 1 - i; j++) {
                if (bubbleData[j] > bubbleData[j + 1]) {
                    int temp = bubbleData[j];
                    bubbleData[j] = bubbleData[j + 1];
                    bubbleData[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

      
        int[] mergeData = data.clone();
        start = System.nanoTime();
        Arrays.sort(mergeData);
        System.out.println("Merge Sort Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
