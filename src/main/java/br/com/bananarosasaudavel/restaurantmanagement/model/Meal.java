package br.com.bananarosasaudavel.restaurantmanagement.model;

import java.util.Map;

public class Meal {
    private MealType mealType;
    private Map<Recipie, Double> recipieList;

    public Meal() {
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public Map<Recipie, Double> getRecipieList() {
        return recipieList;
    }

    public void setRecipieList(Map<Recipie, Double> recipieList) {
        this.recipieList = recipieList;
    }
}
