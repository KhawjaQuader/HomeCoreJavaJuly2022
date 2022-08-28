package hw11_Abstraction.copy;

import java.security.PublicKey;

public interface University extends College, Hospital {
	// Interface University extends College and hospital
	// method declared below
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {// default method created
		System.out.println("This is a default method from University interface");
	}

	public static void library() {// static method created in interface
		System.out.println("This is a static method from University interface");
	}

}