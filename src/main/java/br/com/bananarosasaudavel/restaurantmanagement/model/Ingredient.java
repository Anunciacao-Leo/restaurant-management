package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredientes")
public class Ingredient {
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "unidade_medida")
    private  MeasurementUnit measurementUnit;
    @Column(name = "quantidade_vendida")
    private Double quantitySold;
    @Column(name = "preco_unitario")
    private Double price;
    @Column(name = "rendimento")
    private Double yield;
}
