class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    Item head = null;

    public void addAtBeginning(Item newItem) {
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(Item newItem) {
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newItem;
    }

    public void addAtPosition(Item newItem, int pos) {
        if (pos <= 1) {
            addAtBeginning(newItem);
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;
        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void updateQuantity(int id, int qty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = qty;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: ID " + temp.id);
                return;
            }
            temp = temp.next;
        }
    }

    public double totalInventoryValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }
}
