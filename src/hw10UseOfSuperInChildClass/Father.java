package hw10UseOfSuperInChildClass;

/*
 * Create a package name "hw10UseOfSuperInChildClass" in the HW project. 
 * Inside the package, 
 * a) Create a class name Father. 
 * declare 5 variable like Name, age, sex, usCitizen, FamilyName. 
 * Declare default (declare a sysout inside it) and 
 * parameterized constructor (declare a sysout inside it) from the first 4 variables.
 * Create a regular void type method name father() which is implemented, declare a sysout inside it. 
 * Create a parameterized method fatherInfo() which also contain it's 4 variables, declare a sysout (you can copy from parameterized constructor if you want) 
 * 
 * b) Create a class name 'Daughter', 
 * declare variable birthMonth, age. Declare default (declare a sysout inside it) and
 * parameterized constructor (declare a sysout inside it), and 
 * implement a regular method daughter() and declare a sysout. 
 * Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . 
 * 
 * Now, Daughter extends Father (super class). 
 * Use super method, super keyword and show all of their use in child class. 
 * Use 'FamilyName' variable (from parent class) to initialize by super keyword in child class (Use one constructor and one method to implement them). and 
 * 
 * initialize in a TestFamily Class. 
 * Paste GitHub link below.
 */
public class Father {// Regular class
	String name;// variable declared
	int age;
	char sex;
	boolean usCitizen;
	String familyName;

	public Father() {// Default constructor
		System.out.println("This is default constructor of Father class");
	}

	// Below Parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name:" + name + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen);

	}

	public void father() {// regular void type method
		System.out.println("This is regular void type method implemented");
	}

	// Below parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name:" + name + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen);
	}

}
