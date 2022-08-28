package hw9_Encapsulation;
/*
 * Create a package name "hw9Encapsulation" in the HW project. 
 * Inside the package, a) Create a class, Employee and 
 * declare some private variables----> name, age, sex, usCitizen. 
 * How can you access those variables by the getter and setter method? In EmployeeTest class, 
 * Please execute those variables by the help of getters and setters method and 
 * print Employee info (Use necessary String to make the outcome meaningful, 
 * you can also use \n if you want). 
 * Paste the GitHub link below.
 */
public class Employee {
    private String empNameString;
    private int empAge;
    private char empSex;
    private boolean usCitizen;
	
    public String getEmpNameString() {// getter is return type method
		return empNameString;
	}
	public void setEmpNameString(String empNameString) {// setter is void type parameterized method
		this.empNameString = empNameString;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public char getEmpSex() {
		return empSex;
	}
	public void setEmpSex(char empSex) {
		this.empSex = empSex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}
