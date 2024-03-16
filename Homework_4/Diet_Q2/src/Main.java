public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("John", DietType.NoRestriction),
                new Customer("Alice", DietType.Paleo),
                new Customer("Bob", DietType.Vegan),
                new Customer("Emily", DietType.NoRestriction),
                new Customer("David", DietType.NutAllergy),
                new Customer("Sophia", DietType.Vegan)
        };

        Macronutrient mealFactory = MealFactory.getInstance();

        for (Customer customer : customers) {
            Carbs carbs = mealFactory.createCarbs(customer.getDiet());
            Protein proteins = mealFactory.createProtein(customer.getDiet());
            Fats fats = mealFactory.createFats(customer.getDiet());


            System.out.println(customer.getName() + "'s Meal:");
            System.out.println("Carbs: " + carbs.carbName());
            System.out.println("Proteins: " + proteins.proteinName());
            System.out.println("Fats: " + fats.fatName());
            System.out.println();
        }
    }
}