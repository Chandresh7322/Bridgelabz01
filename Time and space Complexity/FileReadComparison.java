import java.io.*;

public class FileReadComparison {
    public static void main(String[] args) throws Exception {
        File file = new File("large.txt"); 
        
        long start = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        System.out.println("FileReader Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        
        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1);
        isr.close();
        System.out.println("InputStreamReader Time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
