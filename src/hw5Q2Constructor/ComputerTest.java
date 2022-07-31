package hw5Q2Constructor;
/*
 **b) Create another class ComputerTest. 
 *Create object from Computer class, 
 *as many as you want under main method.
 *Initialize all the constructors.
 *I want in console, the first outcome as -> This is from default Constructor of Computer class.
 *Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false.
 *I want the third outcome in console for your configuration.  (Assume you are a Windows user even you are not).
 *Organize your code. 
 *Push in the github. 
 *Paste your github link below.
 */
public class ComputerTest {

	public static void main (String[] args) { 
		Computer computer = new Computer();
		Computer cumputer1 = new Computer("Apple,", "MacBook Air,", " MacOS Mojave, ", 800, 'A', false);
		Computer cumputer2 = new Computer("Dell,", "A123,", "Windows,", 900, 'B', true);
	}		
}	
		

	
