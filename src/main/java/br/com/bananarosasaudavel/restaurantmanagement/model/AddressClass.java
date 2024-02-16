package br.com.bananarosasaudavel.restaurantmanagement.model;

import br.com.bananarosasaudavel.restaurantmanagement.service.ConvertDataInterface;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressClass {
    @JsonAlias("cep")
    private String postalCode;
    @JsonAlias("logradouro")
    private String streetAddress;
    private String number;
    private String unit;
    @JsonAlias("bairro")
    private String addressLine2;
    @JsonAlias("localidade")
    private String city;
    @JsonAlias("uf")
    private String state;

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
        return "AddressClass{" +
                "postalCode='" + postalCode + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
