package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Map;
@Entity
@Table(name = "refeicoes")
public class Meal {
    private Long id;
    @Column(name = "tipo_refeicao")
    private MealType mealType;
    @Column(name = "lista_receitas")
    private Map<Recipie, Double> recipieList;
}
