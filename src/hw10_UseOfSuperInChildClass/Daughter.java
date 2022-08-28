package hw10_UseOfSuperInChildClass;

/*
 *  * b) Create a class name 'Daughter', 
 * declare variable birthMonth, age. Declare default (declare a sysout inside it) and
 * parameterized constructor (declare a sysout inside it), and 
 * implement a regular method daughter() and declare a sysout. 
 * Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . 
 * 
 * Now, Daughter extends Father (super class). 
 * Use super method, super keyword and show all of their use in child class. 
 * Use 'FamilyName' variable (from parent class) to initialize by super keyword in child class (Use one constructor and one method to implement them). and 
 */
public class Daughter extends Father {// Regular class
	String birthMonth;// variable declared
	int age;

	public Daughter() {// Default constructor
		super();// is used to call the constructor of parent class father must before sys
		// Only 1 default constructor or 1 parameterized constructor from parents class
		// Example of parameterized constructor call:- super("Boby", 10);
		super.father();// initialized parent class void type method father in child class
		// Initialized parameterized parent class method fatherInfo in child class
		super.fatherInfo("Clinton", 70, 'M', false);

		super.familyName = "Bush";
		System.out.println("Family Name:" + familyName);

		System.out.println("This is default constructor of Daughter class");
	}

	public Daughter(String birthMonth, int age) {// Parameterized Constructor
		super("Obama", 10, 'M', true);
		super.father();
		super.fatherInfo("Trumph", 6, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + " Age: " + age);
	}

	public void daughter() {// regular void type method
		super.father();
		super.fatherInfo("Biden", 18, 'F', false);
		super.familyName = "Harris";
		System.out.println("Family Name:" + familyName);

		System.out.println("This is regular void type method of Daughter class");
	}

	// Below Void type parameterized method
	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("David", 15, 'M', false);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + " Age: " + age);
	}
}
