package com.fitzgerald.oopinheritence;

public class Bat extends Mammal {
	//member variables of Bat
	public boolean doesShreak;
	public String sounds;
	

	//constructor
	public Bat (String nameInput, String habitatInput, boolean doesShreakInput, String soundInput) {
		super(nameInput, habitatInput);
		this.doesShreak = doesShreakInput;
		this.sounds = soundInput;
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Bat zooming through night sky...");
		this.energyLevel -=50;	
	}
	
	public void eatHumans() {
		System.out.println("I don't eat humans this is mythical, but I eat insects...");
		this.energyLevel +=25;	
	}
	
	public void attackTown() {
		System.out.println("Well, humans keep cutting down our natural habitat, so our swarm will take back \n Swarming town sounds");
		this.energyLevel -=100;	
	}
}
	
	
