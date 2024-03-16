interface Macronutrient {
    Carbs createCarbs(DietType dietType);
    Protein createProtein(DietType dietType);
    Fats createFats(DietType dietType);
}
