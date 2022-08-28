package hw11_Abstraction.copy;

/* Create another Abstract Class EngineeringSchool, 
* create 2 methods inside the Abstract Class 
* - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. 
* Print something inside the non abstract or implemented method . 
*/
public abstract class EngineeringSchool extends NYUniversity {// abstract class created
	public abstract void mechanicalLab();// abstract method declared.

	public void computerLab() {// Non abstract or Implemented method
		System.out.println("This is computerLab non abstract void type method implemented");
	}
	// public default void engineerinLlab() {} default method only allowed in
	// interface

}
