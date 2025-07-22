interface MealPlan {
    String getType();
}

class VegetarianMeal implements MealPlan {
    public String getType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public String getType() {
        return "High-Protein";
    }
}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) {
        this.plan = plan;
    }
    T getPlan() {
        return plan;
    }
}

class MealService {
    static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        return new Meal<>(plan);
    }
}

public class Meal Plan Generator {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal protein = new HighProteinMeal();

        Meal<VegetarianMeal> vegMeal = MealService.generateMealPlan(veg);
        Meal<VeganMeal> veganMeal = MealService.generateMealPlan(vegan);
        Meal<KetoMeal> ketoMeal = MealService.generateMealPlan(keto);
        Meal<HighProteinMeal> proteinMeal = MealService.generateMealPlan(protein);

        System.out.println("Generated: " + vegMeal.getPlan().getType());
        System.out.println("Generated: " + veganMeal.getPlan().getType());
        System.out.println("Generated: " + ketoMeal.getPlan().getType());
        System.out.println("Generated: " + proteinMeal.getPlan().getType());
    }
}
