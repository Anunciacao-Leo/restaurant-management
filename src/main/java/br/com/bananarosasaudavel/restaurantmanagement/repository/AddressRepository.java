package br.com.bananarosasaudavel.restaurantmanagement.repository;

import br.com.bananarosasaudavel.restaurantmanagement.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
