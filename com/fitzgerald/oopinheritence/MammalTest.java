package com.fitzgerald.oopinheritence;

public class MammalTest {

	public static void main(String[] args) {
		// Test Mammal class
		Mammal animal1 = new Mammal("Elephant, Shiki", "Subtropical");
		
		System.out.println(animal1);
		
		animal1.displayEnergy();
		
		Gorilla gorilla1 = new Gorilla("Gorilla, Bambino", "Rainforest", 24, 4);
		
		System.out.println(gorilla1);
		
		gorilla1.displayMammal();
		gorilla1.displayEnergy();
		gorilla1.throwSomething();
		gorilla1.displayEnergy();
		gorilla1.eatBananas();
		gorilla1.displayEnergy();
		gorilla1.climb();
		gorilla1.displayEnergy();
		
		
		Bat bat1 = new Bat("Bat, BitterBip", "Caverns", true, "EEeeeekkk!");
		
		System.out.println(bat1);
		bat1.fly();
		bat1.fly();
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.displayEnergy();
		
		
	}
	

}
