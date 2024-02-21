package br.com.bananarosasaudavel.restaurantmanagement;

import br.com.bananarosasaudavel.restaurantmanagement.model.Address;
import br.com.bananarosasaudavel.restaurantmanagement.model.AddressData;
import br.com.bananarosasaudavel.restaurantmanagement.model.Customer;
import br.com.bananarosasaudavel.restaurantmanagement.repository.AddressRepository;
import br.com.bananarosasaudavel.restaurantmanagement.repository.CustomerRepository;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConsumeApi;
import br.com.bananarosasaudavel.restaurantmanagement.service.ConvertData;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    private ConsumeApi consumeApi = new ConsumeApi();
    private ConvertData convertData = new ConvertData();
    private AddressRepository addressRepository;
    private CustomerRepository customerRepository;

    public Main(AddressRepository addressRepository, CustomerRepository customerRepository) {
        this.addressRepository = addressRepository;
        this.customerRepository = customerRepository;
    }

    public void displayMenu(){
        var choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createCustomerAndAddress();
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 2);
    }

    private Customer insertCustomerData() {
        System.out.println("Cadastro de Cliente");
        System.out.print("Nome completo: ");
        String fullName = scanner.nextLine();
        System.out.print("Endereço de email: ");
        String emailAddress = scanner.nextLine();
        System.out.print("Número de telefone: ");
        String telephoneNumber = scanner.nextLine();

        Customer customer = new Customer();
        customer.setFullName(fullName);
        customer.setEmailAddress(emailAddress);
        customer.setTelephoneNumber(telephoneNumber);

        return customer;
    }

    private Address insertAddressData() {
        System.out.println("Cadastro de Endereço");
        System.out.print("Digite o CEP para buscar o endereço: ");
        String postalCode = scanner.nextLine();

        AddressData addressData = getAddressData(postalCode);
        System.out.println(addressData);

        System.out.print("Número: ");
        String number = scanner.nextLine();
        System.out.print("Complemento: ");
        String unit = scanner.nextLine();

        Address address = new Address();
        address.setPostalCode(addressData.postalCode());
        address.setStreetAddress(addressData.streetAddress());
        address.setNumber(number);
        address.setUnit(unit);
        address.setAddressLine2(addressData.addressLine2());
        address.setCity(addressData.city());
        address.setState(addressData.state());

        return address;
    }

    private void createCustomerAndAddress() {
        Customer customer = insertCustomerData();
        Address address = insertAddressData();

        address.setCustomer(customer);

        Customer savedCustomer = customerRepository.save(customer);
        System.out.println("Cliente salvo com sucesso com ID: " + savedCustomer.getId());

        Address savedAddress = addressRepository.save(address);
        System.out.println("Endereço salvo com sucesso com ID: " + savedAddress.getId());
    }

    private AddressData getAddressData(String postalCode){
        String json = consumeApi.fetchApi("https://viacep.com.br/ws/" + postalCode + "/json/");

        return convertData.getData(json, AddressData.class);
    }
}
