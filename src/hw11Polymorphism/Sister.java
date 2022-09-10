package hw11Polymorphism;

/*
 * Create a package "hw11Polymorphism" inside your HW project and execute the remaining.
 *  Read the question very carefully. 
 *  Create a class Sister. 
 *  Can you create several methods with the same name (sister) inside it with the help of below variables?  
 *  As a variable, use int age1, int age2, int age3, String age4, int age5, int age6 etc in different combination. 
 *  Use void type, parameterized type, return type, static type, final type method by different combinations of the above variable. 
 *  Tell me what is the Method overloading by multiple line comments.  
 *  initialize all the methods in TestFamily class. 
 *  Create another class Niece and inherit (extends) Sister. 
 *  Override all the possible methods by changing logic. 
 *  If some methods are not possible to override, please explain why by the multiple line comments comments. 
 *  Tell me what is the Method overriding by multiple line comments. 
 *  Initialize all the methods of Niece class in TestFamily class.
50 
 */
public class Sister {
	// void type method
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}

	// void type parameterized method 1
	public void sister(int age1) {
		int total1 = age1;
		System.out.println("This is void type parameterized method 1 from Sister class");
	}

	// void type parameterized method
	public void sister(int age1, int age2) {
		int total2 = age1 + age2;
		System.out.println("This is void type parameterized method 2 from Sister class");
	}

	public int sister(int age1, int age2, int age3) {// return type parameterized method
		int total3 = age1 + age2 + age3;
		System.out.println("Total Age of 3 return type method:" + total3);
		return total3;
	}

	// return type parameterized method implemented
	public int sister(int age1, int age2, int age3, String age4) {
		int total4 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total Age of 4 return type method:" + total4);
		return total4;
	}

	// Static type Method implemented
	// Static method can be overloaded --
	// Also return type
	public static int sister(int age1, int age2, int age3, int age4, int age5) {
		int total5 = age1 + age2 + age3 + age4 + age5;
		System.out.println("Total Age of 5 static type method:" + total5);
		return total5;
	}

	// Return type parameterized method which is final implemented
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded -- important
	public final int sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total6 = age1 + age2 + age3 + age4 + age5 + age6;
		System.out.println("Total Age of 6 final  type method:" + total6);
		return total6;
		/*
		 * Ans Method overloading is a feature of Java in which a class has more than
		 * one method of the same name and their parameters are different. Sister class
		 * methods initialized in Test Family class
		 */
	}
}
