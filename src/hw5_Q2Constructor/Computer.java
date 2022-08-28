package hw5_Q2Constructor;

/*Create a package name "hw5Q2Constructor" in your Home Work project. 
 *Inside the package, a) Create a class "Computer". 
 *Declare some variable -- brand, model, operating system, price, grade (grade as char) and madeInUSA.
 *Declare default constructor and
 *more than one parameterized constructor.
 *Use only one System.out.println() in each constructor.
 *b) Create another class ComputerTest. 
 *Create object from Computer class, 
 *as many as you want under main method.
 *Initialize all the constructors.
 *I want in console, the first outcome as -> This is from default Constructor of Computer class.
 *Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false.
 *I want the third outcome in console for your configuration.  (Assume you are a Windows user even you are not).
 *Organize your code. 
 *Push in the github. 
 *Paste your github link below.
 * 
 */
public class Computer {
	public String brand;// variable declared
	public String model;// variable declared
	public String operatingSystem;// variable declared
	public int price;// variable declared
	public char grade;// variable declared
	public boolean madeInUSA;// variable declared

	public Computer() {// Default Constructor declared
		System.out.println("This is from default Constructor of Computer class.");// 1st outcome
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {//2nd outcome

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + " Model: " + model + " Operating System: " + operatingSystem + " Price: $"
				+ price + " ,Grade: " + grade + ", Made in USA: " + madeInUSA);
	}

public Computer(String brand, String model, String operatingSystem, int price, char grade) {//3rd outcome
		
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		
		System.out.println("My Brand: " + brand + " Model: " + model + " Operating System: " + operatingSystem + " Price: $" + price + " ,Grade: " + grade + ", Made in USA: " + madeInUSA); 
				
				
				
				
				
				
				
				
				
		
		
}

}
