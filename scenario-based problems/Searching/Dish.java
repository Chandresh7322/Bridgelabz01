import java.util.*;

class Dish {
    String name, type;
    List<String> tags;

    Dish(String name, String type, List<String> tags) {
        this.name = name;
        this.type = type;
        this.tags = tags;
    }
}

public class SmartMenu {
    public static void main(String[] args) {
        ArrayList<Dish> menu = new ArrayList<>();
        HashSet<String> dishNames = new HashSet<>();

        addDish(menu, dishNames, new Dish("Paneer Butter Masala", "Main", Arrays.asList("paneer", "creamy")));
        addDish(menu, dishNames, new Dish("Spicy Chicken Wings", "Starter", Arrays.asList("spicy", "chicken")));
        addDish(menu, dishNames, new Dish("Veg Biryani", "Main", Arrays.asList("spicy", "rice")));

        searchMenu(menu, "spicy");
    }

    static void addDish(List<Dish> menu, HashSet<String> set, Dish dish) {
        if (set.add(dish.name.toLowerCase())) {
            menu.add(dish);
        }
    }

    static void searchMenu(List<Dish> menu, String keyword) {
        for (Dish dish : menu) {
            if (dish.name.toLowerCase().contains(keyword.toLowerCase()) ||
                dish.tags.stream().anyMatch(tag -> tag.equalsIgnoreCase(keyword))) {
                System.out.println("Match: " + dish.name + " (" + dish.type + ") - Tags: " + dish.tags);
            }
        }
    }
}
