package hw11_Abstraction.copy;

import javax.swing.DefaultBoundedRangeModel;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
//ColumbiaUniversity extends Medical school (regular class to abstract class 
//public abstract void chemistry(); In regular class Abstract method is not possible to declare.
	public void biology() {// Non abstract or Implemented method
		System.out.println("This is biology non abstract method implemented ");
	}

	public ColumbiaUniversity() {// Constructor created & Declared
		System.out.println("This is ColumbiaUniversity default constructor from ColumbiaUniversity Regular class");
	}

	@Override
	public void anatomyLab() {
		System.out.println("This is anatomyLab method");

	}

	@Override
	public void hygiene() {
		System.out.println("This is hygiene method");

	}

	@Override
	public void lawInfo() {
		System.out.println("This is lawInfo method");

	}

	@Override
	public void commonRoom() {
		System.out.println("This is commonRoom method");

	}

	@Override
	public void laboratory() {
		System.out.println("This is laboratory method");

	}

	@Override
	public void languageClub() {
		System.out.println("This is languageClub  method");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is emergencyRoom  method");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is surgeryRoom  method");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is cafeteria method");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This is vocationalInfo method");

	}

	@Override
	public void classSize() {
		System.out.println("This is classSize method");

	}

	@Override
	public void playGround() {
		System.out.println("This is playGround method");

	}

	@Override
	public void teacher() {
		System.out.println("This is teacher method");

	}

	public static void columbiaUniversity() {// static method created in regular class
		System.out.println("This is static method from columbiaUniversity");
	}
	// public default void universityLab() {} default method allowed only in
	// interface

}
