package hw10_Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// MedicalSchool extends NurshingSchool (abstract class to abstract class)
	public abstract void anatomyLab();// abstract method declared.

	public void biochemistryLab() {// Non abstract or Implemented method
		System.out.println("This is biochemistryLab non abstract void type method implemented");
	}

	public MedicalSchool() {// Default Constructor inside Abstract class MedicalSchool declared
	}
	/*
	 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? 
	 * Ans:- 2 key words 1.extends 2.implements
	 * 
	 * Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends or implements keyword?
	 * Ans:- Abstract class can inherit  only 1 Abstract class or only 1 Regular class by extends key word.
	 * Ans:- Abstract class can not inherit interface by extends key word 
	 * Ans:-Abstract class can inherit more then 1 interface by implements key word.
	 * 
	 * How many inheritances is possible by an Abstract Class? Use one of above
	 * Abstract Class (MedicalSchool extends NursingSchool implements LawSchool) and
	 * use the keywords to answer my questions.
	 * Ans:- 2 inheritance. Here Abstract class  MedicalSchool inherit Abstract class NursingSchool by extends key word and
	 inherit interface LawSchool by implements key word.
	 */
}
