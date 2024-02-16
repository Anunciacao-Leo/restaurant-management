package br.com.bananarosasaudavel.restaurantmanagement.model;

public class Customer {
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private Address addressClass;

    public Customer(String fullName, String emailAddress, String phoneNumber, Address address) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.addressClass = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddressClass() {
        return addressClass;
    }

    public void setAddressClass(Address addressClass) {
        this.addressClass = addressClass;
    }

    @Override
    public String toString() {
        return "ClientClass{" +
                "fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addressClass=" + addressClass +
                '}';
    }
}
