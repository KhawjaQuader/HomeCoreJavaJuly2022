package hw8Abstraction;

/*
 * Create a package name "hw8Abstraction" inside your HW project.
 * Inside the package,
 * a) Create an interface "University". Declare some methods inside the interface named--> classSize, playGround, and teacher.
 * b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. 
 * c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub. 
 * d) Create interface VocationalSchool and a method vocationalInfo inside it. 
 * e) Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. 
 * f) Create another interface LawSchool and a method lawInfo inside it. 
 * Now, Can you create a Constructor inside University interface? If yes, create default Constructor on University interface. If no, comment out the 'created constructor' and answer why not?
 */
public interface University {// interface created
	// method declared below
	public void classSize();

	public void playGround();

	public void teacher();

//public University() {} Constructor created
//An Interface in Java doesn't have a constructor because all data members in interfaces are public static final by default, they are constants

}
