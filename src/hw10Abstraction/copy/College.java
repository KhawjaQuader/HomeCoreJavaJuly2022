package hw10Abstraction.copy;

/*
 * c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub. 
 * 
 * Create also one default and one static method dorm and studyRoom inside interface "College".
 */
public interface College {// interface created
	// method declared below
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {// default method created
		System.out.println("This is a default method from College interface");
	}

	public static void studyRoom() {// static method created
		System.out.println("This is a static method from College interface");
	}

}
