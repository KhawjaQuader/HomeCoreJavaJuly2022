package hw11Polymorphism;

public class TestFamily {
    //initialize all the methods in TestFamily class. (from sister class)
	//Initialize all the methods of Niece class in TestFamily class.
	public static void main(String[] args) {
		System.out.println("\n====================Sister Class====================\n");
		Sister sis = new Sister ();
		sis.sister();//void type method called from Sister class and initialized
		sis.sister(1);//void type parameterized method 1 called from Sister class & initialized
		sis.sister(1, 2);//void type parameterized method 2 called from Sister class & initialized
		sis.sister(1, 2, 3);//return type parameterized method 3 called from Sister class & initialized
		sis.sister(1, 2, 3, "4");//return type parameterized method 4 with string called from Sister class & initialized
		Sister.sister(1, 2, 3, 4, 5);//static/return type parameterized method can only be called by Sister class & initialized
		sis.sister(1, 2, 3, 4, 5, 6);//final/return type parameterized method called from Sister class & initialized
	
	    System.out.println("\n====================Niece Class=======================================\n");
	    
	    Niece nc = new Niece();
	    nc.sister();//void type method initialized
	    nc.sister(10);//void type parameterized method initialized
	    nc.sister(10, 20);//void type parameterized method initialized
	    nc.sister(10, 20, 30);//return type parameterized method initialized
	    nc.sister(10, 20, 30, "40");//return type parameterized method initialized
	    //nc.sister(10, 20, 30, 40, 50, 60);final type method
	}

}
