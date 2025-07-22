public class SelectionSort {
    public static void main(String[] args) {
        int[] score = {78 ,45, 85, 60, 90};

        for (int i = 0; i < score.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j] < score[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = score[minIndex];
            score[minIndex] = score[i];
            score[i] = temp;
        }
        for (int score : scores) {
            System.out.print(score + " ");  
        }
    }
}