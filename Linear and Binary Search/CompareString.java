public class CompareStringBufferAndBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        String s = "hello";
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(s);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append(s);
        long end2 = System.nanoTime();
        System.out.println("StringBuilder: " + (end1 - start1));
        System.out.println("StringBuffer: " + (end2 - start2));
    }
}
