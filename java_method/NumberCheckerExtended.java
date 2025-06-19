public class NumberCheckerExtended {
    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        System.out.println("Digit count: " + digits.length);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad: " + isHarshad(num, digits));
        System.out.println("Digit frequencies: ");
        int[][] frequencies = digitFrequencies(digits);
        for (int[] freq : frequencies) {
            System.out.println("Digit " + freq[0] + ": " + freq[1]);
        }
    }

    public static int[] getDigits(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencies[i][0] = i;
            frequencies[i][1] = 0;
        }
        for (int digit : digits) {
            frequencies[digit][1]++;
        }
        return frequencies;
    }
}
