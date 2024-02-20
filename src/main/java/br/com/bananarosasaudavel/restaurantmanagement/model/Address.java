package br.com.bananarosasaudavel.restaurantmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Address {
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

    public Address() {
    }

    public Address(AddressData addressData, String number, String unit) {
        this.postalCode = addressData.postalCode();
        this.streetAddress = addressData.streetAddress();
        this.number = number;
        this.unit = unit;
        this.addressLine2 = addressData.addressLine2();
        this.city = addressData.city();
        this.state = addressData.state();
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

    @Override
    public String toString() {
        return "postalCode='" + postalCode + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", number='" + number + '\'' +
                ", unit='" + unit + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'';
    }
}
