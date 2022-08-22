package hw10Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
//ColumbiaUniversity extends Medical school (regular class to abstract class 
//public abstract void chemistry(); In regular class Abstract method is not possible to declare.
	public void biology() {// Non abstract or Implemented method
		System.out.println("This is biology non abstract method implemented");
	}

	public ColumbiaUniversity() {// Constructor created & Declared
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}
	/*
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class? 
	 * Ans:- 2 key words 1.extends 2.implements.
	 * 
	 * Can a regular Class inherit other Abstract Class or a regular class or interface by extends or implements keyword? 
	 * Ans:- Regular class can inherit only 1 Regular class or only 1 Abstract class by extends key word. 
	 * Ans:- Regular class can not inherit interface by extends key word. 
	 * Ans:- Regular class can inherit interface by implements key word more then 1
	 * 
	 * How many inheritances is possible by a regular Class? Use one of above
	 * regular Classes (ColumbiaUniversity extends MedicalSchool implements
	 * University, VocationalSchool) and use the keywords to answer my questions.
	 * You don't need to execute anything as the main method is absent. 
	 * Ans:- 3 inheritance. Here Regular class ColumbiaUniversity extends Abstract class MedicalSchool
	 * implements interface University, VocationalSchool.
	 */

}
