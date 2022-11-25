package org.formation.coffeeMachine.repository;

import java.util.List;

import org.formation.coffeeMachine.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, String> {
	
	
	
	List<Coffee> findByName(String name);
	
	

}
