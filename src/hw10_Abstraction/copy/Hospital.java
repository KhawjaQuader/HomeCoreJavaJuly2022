package hw10_Abstraction.copy;

/*
 * b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. 
 * 
 * Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 */
public interface Hospital {// interface created
	// method declared below
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {// default method created
		System.out.println("This is a default method from Hospital interface");
	}

	public static void pharmacy() {// static method created
		System.out.println("This is a static method from Hospital interface");
	}
}
