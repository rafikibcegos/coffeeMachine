package org.formation.coffeeMachine.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coffee {
	@Id
	private String id;
	private String name;
	
	//comemntaire
	
	
	
	
	

	public Coffee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public Coffee() {
		
	}




	public Coffee(String name) {
	
		this(UUID.randomUUID().toString(),name);
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Coffe [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}
