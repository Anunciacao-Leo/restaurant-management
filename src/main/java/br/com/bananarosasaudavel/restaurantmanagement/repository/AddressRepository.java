package br.com.bananarosasaudavel.restaurantmanagement.repository;

import br.com.bananarosasaudavel.restaurantmanagement.model.Address;
import br.com.bananarosasaudavel.restaurantmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByCustomer(Optional<Customer> customer);
}
