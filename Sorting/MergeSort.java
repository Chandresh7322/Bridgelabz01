public class MergeSort {
    public static void main(String[] args) {
        int[] prices = {150, 120, 90, 200, 175};
        mergeSort(prices, 0, prices.length - 1);

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        for (int i = 0; i < left.length; i++) left[i] = arr[l + i];
        for (int j = 0; j < right.length; j++) right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}
