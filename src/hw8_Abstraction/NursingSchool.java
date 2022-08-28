package hw8_Abstraction;

/* Create another Abstract Class NursingSchool, 
* create 2 methods inside the Abstract Class 
* - one is abstract and another one is the non-abstract name -- hygiene and caring.     Print something inside the non-abstract or implemented method. 
* Can you create a Constructor inside MedicalSchool Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?
*/
public abstract class NursingSchool {// abstract class created
	public abstract void hygiene();// abstract method declared.

	public void caring() {// Non abstract or Implemented method
		System.out.println("This is caring non abstract void type method implemented");
	}

}
