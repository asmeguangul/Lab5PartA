package repositories;

import domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositiory extends JpaRepository<Customer, Integer> {
}
