package br.com.bananarosasaudavel.restaurantmanagement.model;

import java.util.Map;

public class Meal {
    private MealType mealType;
    private Map<Recipe, Double> recipieList;

    public Meal() {
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public Map<Recipe, Double> getRecipieList() {
        return recipieList;
    }

    public void setRecipieList(Map<Recipe, Double> recipieList) {
        this.recipieList = recipieList;
    }
}
