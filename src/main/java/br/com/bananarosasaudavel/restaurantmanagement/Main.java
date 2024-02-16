package br.com.bananarosasaudavel.restaurantmanagement;

import br.com.bananarosasaudavel.restaurantmanagement.model.Address;
import br.com.bananarosasaudavel.restaurantmanagement.model.AddressData;
import br.com.bananarosasaudavel.restaurantmanagement.model.Customer;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConsumeApi;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConvertData;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    private ConsumeApi consumeApi = new ConsumeApi();
    private ConvertData convertData = new ConvertData();

    public void displayMenu(){
        System.out.println("Enter the full name of the customer: ");
        var fullName = scanner.nextLine();

        System.out.println("Enter the e-mail address of the customer: ");
        var emailAddress = scanner.nextLine();

        System.out.println("Enter the phone number of the customer: ");
        var phoneNumber = scanner.nextLine();

        System.out.println("Enter the desired postal code (numbers only): ");
        String postalCode = scanner.nextLine();

        String json = consumeApi.fetchApi("https://viacep.com.br/ws/" + postalCode + "/json/");

        AddressData addressData = convertData.getData(json, AddressData.class);

        System.out.println("Enter the house number: ");
        var number = scanner.nextLine();

        System.out.println("Enter the unit: ");
        var unit = scanner.nextLine();

        Address address = new Address(addressData, number, unit);

        Customer customer = new Customer(fullName, emailAddress, phoneNumber, address);
        System.out.println(customer);

    }
}
