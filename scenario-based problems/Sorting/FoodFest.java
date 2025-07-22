import java.util.Arrays;

public class FoodFest {
    public static void main(String[] args) {
        int[] zone1 = {100, 150, 200};
        int[] zone2 = {120, 180, 220};

        int[] merged = mergeSortedArrays(zone1, zone2);
        System.out.println("Combined sorted footfall data:");
        for (int count : merged) {
            System.out.print(count + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }
}
