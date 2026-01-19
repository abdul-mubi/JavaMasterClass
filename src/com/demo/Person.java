package com.demo;

import java.util.Objects;

public class Person {
	private String name;
	private int id;
	
	Person(){
		System.out.println("No-arg constructor");
	}
	
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	Person(Person object){
		this.name = object.getName();
		this.id = object.getId();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	

}
