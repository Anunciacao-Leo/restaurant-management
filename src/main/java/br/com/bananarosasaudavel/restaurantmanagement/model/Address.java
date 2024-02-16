package br.com.bananarosasaudavel.restaurantmanagement.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Address {

    private String postalCode;

    private String streetAddress;
    private String number;
    private String unit;

    private String addressLine2;

    private String city;

    private String state;

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
