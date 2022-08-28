package hw3_JavaVariables;

public class AboutMe {

	public String name;// variable declared

	public String nickname = "Boby";// variable initialized

	public byte age = 55;
	public short myApertmentRent = 2000;
	public int mySalary = 1000;
	public long myIdNumber = 1234567891234L;
	public float myHeight = 1.123f;
	public double myGrade = 3.12345678;
	public char gender = 'M';
	public boolean married = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.nickname);
		System.out.println("My Nick Name: " + aboutMe.nickname + ", My Salary: " + aboutMe.mySalary);
		System.out.println(
				"My Nick Name: " + aboutMe.nickname + ", My Age: " + aboutMe.age + ", My Gneder: " + aboutMe.gender);
	}

}
