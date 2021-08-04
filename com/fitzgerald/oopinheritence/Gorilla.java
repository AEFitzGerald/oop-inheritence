package com.fitzgerald.oopinheritence;

public class Gorilla extends Mammal {
	//member variables of Gorilla
	public int age;
	public int troopSize;
	
	//constructor
	public Gorilla (String nameInput, String habitatInput, int ageInput, int troopSizeInput) {
		super(nameInput, habitatInput);
		this.age = ageInput;
		this.troopSize = troopSizeInput;
		
	}
	
	public void throwSomething() {
		System.out.println("Throwing something...");
		this.energyLevel -=5;
		
	}
	
	public void eatBananas() {
		System.out.println("Eating yummy bananas...");
		this.energyLevel +=10;	
	}
	
	public void climb() {
		System.out.println("Climbing trees all day...");
		this.energyLevel -=10;	
	}
}
