package hw9Encapsulation;

/*
 * How can you access those variables by the getter and setter method? In EmployeeTest class, 
 * Please execute those variables by the help of getters and setters method and 
 * print Employee info (Use necessary String to make the outcome meaningful, 
 * you can also use \n if you want). 
 * Paste the GitHub link below.
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		// In encapsulation in Test class need to put/create argument/value inside
		// parameterized method
		employee.setEmpNameString("James Bond");
		employee.setEmpAge(55);
		employee.setEmpSex('M');
		employee.setUsCitizen(false);

		System.out.println("Employee Name: " + employee.getEmpNameString() + "\nAge: " + employee.getEmpAge()
				+ "\nSex: " + employee.getEmpSex() + "\nIs US Citizen?: " + employee.isUsCitizen());
		// We need to call in sysout boolean type with isUsCitizen. 

	}

}
