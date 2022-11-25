package org.formation.coffeeMachine.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.formation.coffeeMachine.model.Coffee;
import org.formation.coffeeMachine.repository.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CoffeeService implements ICoffeeService  {

	private CoffeeRepository coffeeDao;

	public CoffeeService(CoffeeRepository coffeeDao) {

		this.coffeeDao = coffeeDao;
		System.out.println(this.getClass().getName());
	}

	@PostConstruct
	
	public void loadData() {

		coffeeDao.saveAll(List.of(

				new Coffee("Café Cereza"), 
				new Coffee("Café Ganador"), 
				new Coffee("Café Lareno"),
				new Coffee("Café Tres Pontas"))

		);

	}

//	@PostConstruct
//	private void loadData() {
//
//	}

	
	
	@Override
//	@GetMapping
	public Iterable<Coffee> gettCoffees() {
		return coffeeDao.findAll();

	}
	
	@Override
//	@GetMapping
	public Iterable<Coffee> gettCoffees(String name) {
		return coffeeDao.findByName(name);

	}
	
	

	@Override
//	@GetMapping("/{id}")
     public Optional<Coffee> gettCoffeeById(@PathVariable String id) {
		
		
//		coffees.stream().filter(e->e.getId() == id);
//		for (Coffee c : coffees) {
//			if (c.getId().equals(id)) {
//				return Optional.of(c);
//			}
			
//		}
		
//		return Optional.empty();	
		return coffeeDao.findById(id);
		
		
	}
	

	@Override
//	@PostMapping
      public Coffee posttCoffee(@RequestBody Coffee coffee) {
//              coffee.setName(UUID.randomUUID().toString());
//		      coffees.add(coffee);
//		return coffee;
		return coffeeDao.save(coffee);
	
	
}
	

	
	@Override
//	@PutMapping("/{id}")
	public ResponseEntity<Coffee> puttCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
		

		
		return (coffeeDao.existsById(id)) 
		?  new ResponseEntity<>(coffeeDao.save(coffee), HttpStatus.OK):
			new ResponseEntity<> (coffeeDao.save(coffee), HttpStatus.CREATED);
		
		
	}
	
	@Override
//	@DeleteMapping("/{id}")
	public void deletetCoffee(@PathVariable String id) {
		
//		coffees.removeIf(c -> c.getId().equals(id));
		coffeeDao.deleteById(id);
		
	}

	

	
	
	
	
	
	
}
