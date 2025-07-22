import java.util.*;

public class SearchStructures {
    public static void main(String[] args) {
        int N = 1_000_000;
        Random random = new Random();

        int[] arr = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            int val = random.nextInt(N * 2);
            arr[i] = val;
            hashSet.add(val);
            treeSet.add(val);
        }

        int target = arr[N / 2];

       
        long start = System.nanoTime();
        for (int x : arr) {
            if (x == target) break;
        }
        System.out.println("Array Search Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

       
        start = System.nanoTime();
        hashSet.contains(target);
        System.out.println("HashSet Search Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        
        start = System.nanoTime();
        treeSet.contains(target);
        System.out.println("TreeSet Search Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
