package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override?
*/

	public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
		car(4, "BMW");
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int Bonus = 20000;
		int RentalIncome=10000;
		int SideIncome=20000;
		int newIncome = calculateAnnualIncome+Bonus+RentalIncome+SideIncome;
		System.out.println("My Annual Income = " + newIncome);
	}
	
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Audi !");
	}
	
	public static void car(int door){
		System.out.println("My car is Audi !, it has door: "+ door);
	}
	
	public static void car(String color){
		System.out.println("My car is Audi !, it has color: "+ color);
	
	}
	public static void car(int wheel,String brand){
		System.out.println("My car is "+ brand +" !, it has wheel: "+wheel);
		
		
	}
	

}
