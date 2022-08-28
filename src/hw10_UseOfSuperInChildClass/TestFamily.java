package hw10_UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized from Daughter Class ----------");
		Daughter daughter = new Daughter();

		System.out.println("\n---------- parameterized constructor initialized from Daughter Class ----------");
		Daughter daughter1 = new Daughter("March", 25);

		System.out.println("\n---------- void type method initialized from Daughter Class ----------");
		daughter.daughter();

		System.out.println("\n---------- parameterized method initialized from Daughter Class ----------");
		daughter1.daughterInfo("April", 35);

	}

}
