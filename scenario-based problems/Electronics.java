interface Product {
    String getInfo();
}

class Electronics implements Product {
    public String getInfo() {
        return "Electronics item";
    }
}

class InventoryManager {
    HashMap<String, Product> inventory = new HashMap<>();

    void addProduct(String id, Product product) {
        inventory.put(id, product);
    }

    Product getProduct(String id) {
        return inventory.get(id);
    }
}
