package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "receitas")
public class Recipie {
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "descricao")
    private String description;
    @Column(name = "lista_ingredientes")
    private List<Ingredient> ingredientList;
}
