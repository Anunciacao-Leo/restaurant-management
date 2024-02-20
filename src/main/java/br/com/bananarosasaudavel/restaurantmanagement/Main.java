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

//        System.out.println("Enter the desired postal code (numbers only): ");
//        String postalCode = scanner.nextLine();
//
//        String json = consumeApi.fetchApi("https://viacep.com.br/ws/" + postalCode + "/json/");
//
//        AddressData addressData = convertData.getData(json, AddressData.class);
//
//        Address address = new Address(addressData, "520", "8E T4");
//
//        System.out.println(address);

    }
}
