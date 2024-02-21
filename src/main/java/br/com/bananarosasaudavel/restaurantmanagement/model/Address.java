package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "enderecos")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cep")
    private String postalCode;
    @Column(name = "logradouro")
    private String streetAddress;
    @Column(name = "numero")
    private String number;
    @Column(name = "complemento")
    private String unit;
    @Column(name = "bairro")
    private String addressLine2;
    @Column(name = "cidade")
    private String city;
    @Column(name = "estado")
    private String state;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
