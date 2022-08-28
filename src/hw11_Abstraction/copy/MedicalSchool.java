package hw11_Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// MedicalSchool extends NurshingSchool (abstract class to abstract class)
	public abstract void anatomyLab();// abstract method declared.

	public void biochemistryLab() {// Non abstract or Implemented method
		System.out.println("This is biochemistryLab non abstract void type method implemented");
	}

	public MedicalSchool() {// Default Constructor inside Abstract class MedicalSchool declared
	}

	public static void medicalSchool() {// static method created in abstract class
		System.out.println("This is static method from MedicalSchool");
	}

}
