package org.formation.coffeeMachine.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.formation.coffeeMachine.model.Coffee;
import org.formation.coffeeMachine.repository.CoffeeRepository;
import org.formation.coffeeMachine.service.CoffeeService;
import org.formation.coffeeMachine.service.ICoffeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/coffees")



public class RestApiDemoController {



//	private List<Coffee> coffees = new ArrayList<>();
// private CoffeeRepository coffeeRepository;
 
 private ICoffeeService coffeeService;
 
//	public RestApiDemoController(CoffeeRepository coffeeRepository) {

//	coffees.addAll(
//			
//			
//			List.of(new Coffee("Distributeur"), 
//					new Coffee("Robusta"), 
//					new Coffee("GoodOne"), 
//					new Coffee("Deca")));
		
		
//		
//		coffeeRepository.saveAll(List.of(
//				new Coffee("Café Cereza"), 
//				new Coffee("Café Ganador"), 
//				new Coffee("Café Lareno"), 
//				new Coffee("Café Tres Pontas")));
//				
//	
//	this.coffeeService = coffeeService;
//	
//	
//}
	
	public RestApiDemoController(ICoffeeService coffeeService) {
	super();
	this.coffeeService = coffeeService;
}

	@GetMapping("/coffees")
	Iterable<Coffee> getCoffees() {
		return coffeeService.gettCoffees();

	}

	@GetMapping("/coffees/{id}")
     Optional<Coffee> getCoffeeById(@PathVariable String id) {
		
		
//		coffees.stream().filter(e->e.getId() == id);
//		for (Coffee c : coffees) {
//			if (c.getId().equals(id)) {
//				return Optional.of(c);
//			}
			
//		}
		
//		return Optional.empty();	
		return coffeeService.gettCoffeeById(id);
		
		
	}
	

	@PostMapping("/coffees")
      Coffee postCoffee(@RequestBody Coffee coffee) {
//              coffee.setName(UUID.randomUUID().toString());
//		      coffees.add(coffee);
//		return coffee;
		return coffeeService.posttCoffee(coffee);
	
	
}
	

	
	@PutMapping("/coffees/{id}")
	ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
		
		
		return coffeeService.puttCoffee(id, coffee);
		
//		int coffeeIndex = -1;
//		
//		for (Coffee c : coffees) {
//			if (c.getId().equals(id)) {
//				coffeeIndex = coffees.indexOf(c);
//				coffees.set(coffeeIndex, coffee);
//			}
//			
//		}
//		return (coffeeIndex == -1) ?  new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED):
//			new ResponseEntity<> ( coffee, HttpStatus.OK);
		
		
//		?  new ResponseEntity<>(coffeeService.posttCoffee(coffee), HttpStatus.OK):
//			new ResponseEntity<> (coffeeService.posttCoffee(coffee), HttpStatus.CREATED);
		
		
	}
	
	@DeleteMapping("/coffees/{id}")
	void deleteCoffee(@PathVariable String id) {
		
//		coffees.removeIf(c -> c.getId().equals(id));
		coffeeService.deletetCoffee(id);
		
	}
	
	
	@GetMapping("/coffees/name/{name}")
	Iterable<Coffee> gettCoffees(@PathVariable String name) {
	
//	Iterable<Coffee> getCoffees(String name) {
		return coffeeService.gettCoffees(name);

	}
	
	

	
	
}
