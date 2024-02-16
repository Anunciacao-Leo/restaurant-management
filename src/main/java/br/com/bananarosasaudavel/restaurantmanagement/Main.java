package br.com.bananarosasaudavel.restaurantmanagement;

import br.com.bananarosasaudavel.restaurantmanagement.model.AddressClass;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConsumeApi;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConvertData;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConvertDataInterface;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    private ConsumeApi consumeApi = new ConsumeApi();
    private ConvertData convertData = new ConvertData();

    public void displayMenu(){
        System.out.println("Enter the desired postal code (numbers only): ");
        String postalCode = scanner.nextLine();

        String json = consumeApi.fetchApi("https://viacep.com.br/ws/" + postalCode + "/json/");

        AddressClass addressClass = convertData.getData(json, AddressClass.class);
        System.out.println(addressClass);
    }
}
