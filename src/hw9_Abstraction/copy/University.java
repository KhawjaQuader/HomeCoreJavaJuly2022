package hw9_Abstraction.copy;

import java.security.PublicKey;

/*
 * Copy your previous package "hw8Abstraction" , paste and rename it to "hw9Abstraction"
 * inside your HW project and execute the below in hw9Abstraction package. 
 * Read the question very carefully. 
 
 * Create one default and one static method gymnasium and library inside interface
 * "University". 
 * 
 * Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 * 
 * Create also one default and one static method dorm and studyRoom inside interface "College".
50 points
  */
public interface University extends College, Hospital{
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
	/*
	 * Q = i) how many keywords are used for the inheritance in Interface, answer by Java comments? 
	 *  Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word?
	 *  How many inheritance is possible? Use the Interface -- "University" to answer my questions (University extends College, Hospital) (by multiple line comments).  		}
	 */
	//Ans:-
	// 1 key words (extends)
	// interface can inherit interface by extends keyword more then 1
	// interface can not inherit regular class by extends key word
	// interface can not inherit abstract class by extends key word	
	}	
	}