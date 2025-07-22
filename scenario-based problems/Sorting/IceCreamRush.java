public class IceCreamRush {
    public static void main(String[] args) {
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mango", "Pistachio", "Cookie", "Mint", "Blueberry"};
        int[] sales = {150, 200, 120, 180, 90, 220, 160, 130};

        
        for (int i = 0; i < sales.length - 1; i++) {
            for (int j = 0; j < sales.length - 1 - i; j++) {
                if (sales[j] < sales[j + 1]) {
                    
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;

                   
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }

        System.out.println("Flavors sorted by popularity:");
        for (int i = 0; i < flavors.length; i++) {
            System.out.println(flavors[i] + " - " + sales[i] + " sales");
        }
    }
}
