package org.formation.coffeeMachine.service;

import java.util.List;
import java.util.Optional;

import org.formation.coffeeMachine.model.Coffee;
import org.formation.coffeeMachine.repository.CoffeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICoffeeService {



	Iterable<Coffee> gettCoffees();

	Optional<Coffee> gettCoffeeById(String id);

	Coffee posttCoffee(Coffee coffee);

	ResponseEntity<Coffee> puttCoffee(String id, Coffee coffee);

	void deletetCoffee(String id);
	
	Iterable<Coffee> gettCoffees(String name);
	

}