package hw10Abstraction.copy;

import java.security.PublicKey;

public interface University extends College, Hospital {
	// Interface University extends College and hospital
	// method declared below
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {// default method created
		System.out.println("This is a default method from University interface");
	}

	public static void library() {// static method created
		System.out.println("This is a static method from University interface");
	}
	/*
	 * i) Total how many keywords are used for the inheritance in Interface, answer
	 * by Java comments? 
	 * Ans:- Only 1 extends key word use in interface.
	 * 
	 * Can an interface inherit other Interfaces, or a regular class or abstract
	 * class by extends or implements keyword?
	 * Ans:- interface can inherit more then 1 interface by extends key word 
	 * Ans:-Interface can not inherit abstract or regular class by extends key word.
	 * Ans:-Interface can not inherit interface Abstract class or Regular class by implements key word
	 * 
	 * How many inheritance is possible? Use the Interface -- "University" to answer
	 * my questions (University extends College, Hospital) (by multiple line  comments).
	 * Ans:- Here University inherit 2 interface that is College & Hospital
	 */
}