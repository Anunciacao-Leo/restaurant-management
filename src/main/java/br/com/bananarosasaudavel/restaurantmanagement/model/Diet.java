package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "dietas")
public class Diet {
    private Long id;
    @Column(name = "cliente")
    private Customer customer;
    @Column(name = "descricao")
    private String description;
    @Column(name = "refeicoes")
    private List<Meal> meals;
}
