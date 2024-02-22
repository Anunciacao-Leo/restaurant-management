package br.com.bananarosasaudavel.restaurantmanagement.model;

import java.util.List;

public class Ingredient {
    private Long id;
    private String name;
    private  MeasurementUnit measurementUnit;
    private Double quantitySold;
    private Double price;
    private Double ingredientYield;
    private List<Recipe> recipe;

    public Ingredient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Double getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(Double quantitySold) {
        this.quantitySold = quantitySold;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getIngredientYield() {
        return ingredientYield;
    }

    public void setIngredientYield(Double ingredientYield) {
        this.ingredientYield = ingredientYield;
    }
}
