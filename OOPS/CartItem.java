package OOPS;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity = qty;
        System.out.println("Item added to cart.");
    }

    void removeItem() {
        System.out.println("Item removed from cart.");
        itemName = "";
        price = 0;
        quantity = 0;
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.addItem("Headphones", 799.99, 2);
        item.displayTotalCost();

        item.removeItem();
        item.displayTotalCost();
    }
}
