package br.com.bananarosasaudavel.restaurantmanagement;

import br.com.bananarosasaudavel.restaurantmanagement.service.ConsumeApi;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Enter the desired postal code (numbers only): ");
        String postalCode = scanner.nextLine();

        ConsumeApi consumeApi = new ConsumeApi();
        String test = consumeApi.fetchApi("https://viacep.com.br/ws/" + postalCode + "/json/");
        System.out.println(test);
    }
}
