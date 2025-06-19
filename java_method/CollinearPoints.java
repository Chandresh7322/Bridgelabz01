public class CollinearPoints {
    public static void main(String[] args) {
        int x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;
        if (isCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear");
        } else {
            System.out.println("Points are not collinear");
        }
    }

    public static boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
}
