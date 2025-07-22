public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {4, 7, -2, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
