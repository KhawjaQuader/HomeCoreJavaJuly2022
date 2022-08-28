package hw11_Abstraction.copy;

/*
 *Create another regular Class RockefellerUniversity, 
 *create  non-abstract method -- maths.
 *Print something inside the non-abstract or implemented method.    
 */
public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {// regular class created
	public void maths() {// Non abstract or Implemented method
		System.out.println("This is maths non abstract method implemented");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This is aeronauticalInfo method");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("This is mechanicalLab method");

	}
}
