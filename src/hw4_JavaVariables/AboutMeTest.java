package hw4_JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();// Constructor initialized
		aboutMe.nickname = "Boby";// string initialized
		aboutMe.age = 55;// byte initialized
		aboutMe.myApertmentRent = 12345;// short initialized
		aboutMe.mySalary = 2000;// int initialized
		aboutMe.myIdNumber = 12345678910l;// long initialized
		aboutMe.myHeight = 5.90f;// float initialized
		aboutMe.myGrade = 3.51234567890;// double initialized
		aboutMe.gender = 'M';// char initialized
		aboutMe.married = true;// boolean initialized

		aboutMe.aboutMe();//method called

		System.out.println("\n****************************************************\n");

		AboutMe aboutAlex = new AboutMe();// Consturctor initialized
		aboutAlex.nickname = "Alex";// string initialized
		aboutAlex.age = 50;// byte initialized
		aboutAlex.myApertmentRent = 5432;// short initialized
		aboutAlex.mySalary = 5000;// int initialized
		aboutAlex.myIdNumber = 12345678911l;// long initialized
		aboutAlex.myHeight = 5.50f;// float initialized
		aboutAlex.myGrade = 3.41234567890;// double initialized
		aboutAlex.gender = 'M';// char initialized
		aboutAlex.married = false;// boolean initialized

		aboutAlex.aboutMe();//method called

	}

}
