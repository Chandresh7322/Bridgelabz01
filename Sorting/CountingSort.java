public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {13, 15, 12, 10, 14, 18, 17, 10};
        int max = 18, min = 10;

        int[] count = new int[max - min + 1];
        for (int age : ages) count[age - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
