package hw9_Abstraction.copy;

/*
 *(Continue from above inside same package) Create a regular Class ColumbiaUniversity,
 *create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology.
 *if any of them is not possible to create, simply comment out the method and explain why in the comment out inside this class only.
 *Print something inside the non-abstract or implemented method.
 *Can you create a Constructor inside a regular Class? If yes, create default Constructor in ColumbiaUniversity. If no, comment out the created constructor and answer why not? 
 *   
 *Create another regular Class NYUniversity, create  non-abstract method -- anthropology.
 *Print something inside the non-abstract or implemented method. 
 *    
 *Create another regular Class RockefellerUniversity, 
 *create  non-abstract method -- maths.
 *Print something inside the non-abstract or implemented method.    
 */
public class ColumbiaUniversity extends MedicalSchool {
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
	/*
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class?  Can a regular Class inherit other Abstract Class or a
	 * regular class or interface by extends key word? How many inheritances is
	 * possible by a regular Class? (use java comments for the above question). Use
	 * one of above regular Classes (ColumbiaUniversity extends MedicalSchool ) and
	 * use the keywords to answer my questions. You don't need to execute anything
	 * as the main method is absent. no github link is necessary to paste.
	 */
	// Ans:-
	// 1 key words (extends)
	// regular class can inherit only one regular or abstract class by extends key
	// words
	// regular class can not inherit interface by extends key words

}
