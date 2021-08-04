package com.fitzgerald.oopinheritence;

public class Mammal {
	//member variables
	public String name;
	public String habitat;
	public int energyLevel;

	//constructor
	//inputs that parent needs for constructor go into super for inherited class.
	public Mammal(String nameInput, String habitatInput) {
	this.name = nameInput;
	this.habitat = habitatInput;
	this.energyLevel = 100;
	}
	
	//display all mammal info
	public void displayMammal() {		
		String whatMammal = String.format("Name: %s \nHabitat: %s\nEnergy Level: %s ", this.name, this.habitat, this.energyLevel);
	
	System.out.println(whatMammal);
		
	}
	//display energy method
	public void displayEnergy() {
		String whatEnergy = String.format("The Energy level for this %s is: %s", this.name, this.energyLevel);
		
		System.out.println(whatEnergy);
	}
}


