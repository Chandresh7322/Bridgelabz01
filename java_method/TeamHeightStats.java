import java.util.Random;

public class TeamHeightStats {
    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) if (i < min) min = i;
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
        System.out.println("Mean: " + mean(heights));
    }
}
