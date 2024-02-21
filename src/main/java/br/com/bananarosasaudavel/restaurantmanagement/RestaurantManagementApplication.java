package br.com.bananarosasaudavel.restaurantmanagement;

import br.com.bananarosasaudavel.restaurantmanagement.repository.AddressRepository;
import br.com.bananarosasaudavel.restaurantmanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantManagementApplication implements CommandLineRunner {
	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private CustomerRepository customerRepository;


	public static void main(String[] args) {
		SpringApplication.run(RestaurantManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(addressRepository, customerRepository);
		main.displayMenu();
	}
}
