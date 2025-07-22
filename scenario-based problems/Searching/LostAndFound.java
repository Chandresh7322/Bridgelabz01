import java.util.*;

public class LostAndFound {
    public static void main(String[] args) {
        HashMap<String, LinkedList<String>> items = new HashMap<>();
        HashSet<String> uniqueItems = new HashSet<>();

        addItem(items, uniqueItems, "bags", "Red Nike backpack");
        addItem(items, uniqueItems, "mobiles", "Black iPhone");
        addItem(items, uniqueItems, "books", "Calculus textbook");
        addItem(items, uniqueItems, "bags", "Blue Adidas duffel");

        searchItem(items, "bags", "nike");
    }

    static void addItem(HashMap<String, LinkedList<String>> map, HashSet<String> set, String type, String desc) {
        if (!set.contains(desc.toLowerCase())) {
            map.putIfAbsent(type, new LinkedList<>());
            map.get(type).add(desc);
            set.add(desc.toLowerCase());
        }
    }

    static void searchItem(HashMap<String, LinkedList<String>> map, String type, String keyword) {
        LinkedList<String> list = map.get(type);
        if (list == null) return;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Match: \"" + list.get(i) + "\" at position " + i);
            }
        }
    }
}
