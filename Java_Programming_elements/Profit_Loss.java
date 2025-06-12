package Java_Programming_elements;
public class Profit_Loss {
    public static void main (String[] args) {
        double costprice = 129;
        double sellingprice = 191;
        double profit = sellingprice - costprice;
        double profitPercentage = (profit / costprice) * 100;
        System.out.println("Cost Price: " + costprice);
        System.out.println("Selling Price: " + sellingprice);
        System.out.println("Profit: " + profit);
    }
    
}
