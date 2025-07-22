public class StringConcatPerformance {
    public static void main(String[] args) {
        int N = 100_000;

       
        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        System.out.println("String Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        System.out.println("StringBuilder Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbuf.append("a");
        }
        System.out.println("StringBuffer Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
