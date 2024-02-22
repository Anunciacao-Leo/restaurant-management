package br.com.bananarosasaudavel.restaurantmanagement.repository;

import br.com.bananarosasaudavel.restaurantmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByFullNameContainingIgnoreCase(String customerName);
}
