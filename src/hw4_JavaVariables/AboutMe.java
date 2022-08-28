package hw4_JavaVariables;

public class AboutMe {

	public String nickname;// variable declared
	public byte age;// variable declared
	public short myApertmentRent;// variable declared
	public int mySalary;// variable declared
	public long myIdNumber;// variable declared
	public float myHeight;// variable declared
	public double myGrade;// variable declared
	public char gender;// variable declared
	public boolean married;// variable declared

	public AboutMe() {// Constructor declared if there is no sysout
		System.out.println("This is all about us:"); // Constructor Initialized

		System.out.println("\n******************************************************\n");

	}

	public void aboutMe() {//method implemented and  concatanation
		System.out.println("My nick name:" + nickname + "\t\tMy age:" + age + "\t\t\tMy Apartment Rent "
				+ myApertmentRent + "\nMy Salary:" + mySalary + "\t\t\tMy Id Number:" + myIdNumber + "\tMy height:"
				+ myHeight + "\nMy Grade:" + myGrade + "\t\tMy Gender:" + gender + "\t\t\tMy Status " + married);

	}

}
