package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Customer {
    private Long id;
    @Column(name = "nome_completo")
    private String fullName;
    @Column(name = "email")
    private String emailAddress;
    @Column(name = "telefone")
    private String telephoneNumber;
    @Column(name = "endereco")
    private Address address;
}
