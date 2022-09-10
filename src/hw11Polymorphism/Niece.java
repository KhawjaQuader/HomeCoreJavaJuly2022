package hw11Polymorphism;

/* Create another class Niece and inherit (extends) Sister. 
 * Override all the possible methods by changing logic. 
 * If some methods are not possible to override, please explain why by the multiple line comments comments. 
 * Tell me what is the Method overriding by multiple line comments. 
*/
public class Niece extends Sister {
	@Override
	public void sister() {// here by @override at top performing method override
		System.out.println("This is void type method ");
	}

	@Override
	public void sister(int age1) {
		int total1 = age1 + 1;// here by add 1 changing logic and performing method override
		System.out.println("This is void type parameterized method 1 ");
	}

	@Override
	public void sister(int age1, int age2) {
		int total2 = age1 + age2 - 1;// here by minus 1 changing logic and performing method override
		System.out.println("This is void type parameterized method 2:" + total2);
	}

	@Override
	public int sister(int age1, int age2, int age3) {// return type parameterized method
		int total3 = age1 + age2 + age3 * 2;// here by multiply 2 changing logic and performing method override
		System.out.println("Total Age of 3 return type method:" + total3);
		return total3;
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total4 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total Age of 4 return type method:" + total4);
		return total4;
	}

	/*
	 * The method landCalculator can't override or implemented because static is a
	 * local member method of a class) So, static method can't be override, if we
	 * remove @override it will work as static method of this Niece class
	 * 
	 * @Override public static int sister(int age1, int age2, int age3, int age4,
	 * int age5) { int total5 = age1 + age2 + age3 + age4 + age5;
	 * System.out.println("Total Age of 5 static type method:" + total5); return
	 * total5; }
	 * =============================================================================
	 * ======
	 * 
	 * final type of method can not be override/overridden public final int
	 * sister(int age1, int age2, int age3, int age4, int age5, int age6) { int
	 * total6 = age1 + age2 + age3 + age4 + age5 + age6;
	 * System.out.println("Total Age of 6 final  type method:" + total6); return
	 * total6;
	 * 
	 * }
	 *   Tell me what is the Method overriding by multiple line comments. 
	 *   Same method name, same signature/parameter but Overriding the logic of the method is called method Overriding.
	 */
}
