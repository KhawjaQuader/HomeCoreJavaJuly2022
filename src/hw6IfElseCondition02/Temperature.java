package hw6IfElseCondition02;

import java.util.Scanner;

/*
 * Create a package name --> "hw6IfElseCondition02" *  inside your HW project.
 * Create a Class, name "Temperature". Type the main method.
 * After the main method, Use Scanner class to define a int type variable todaysTemperature.
 * Now write some condition.
 * a)If temperature is less than 32, outcome will be "Freezing"
 * b)If temperature is less than 55, outcome will be "Pleasant"
 * c)If temperature is less than 73, outcome will be "Getting Warmer"
 * d)If temperature is less than 101, outcome will be "Hot" And finally
 * e) the outcome will be "Ice on my Head Please". In the above 5 condition,
 * use appropriate key word like if, else if, else to execute today's Temperature.
 * Run the code and type today's temperature in console and find the Temperature of Today.
 * Please organize the code (very important). don't give any white space.
 * push the code to GitHub and add the link below.
 */
public class Temperature {

	public static void main(String[] args) {
		System.out.println("Todays temperature ");
		Scanner scanner = new Scanner(System.in);
		int tmp = scanner.nextInt();
		if (tmp < 32) {
			System.out.println("Freezing");
		}
			else if (tmp >= 32 && tmp < 55 ) {
				System.out.println("Pleasant");
			}
			else if (tmp >= 55 && tmp < 73 ) {
				System.out.println("Getting warm");
			}
			else if (tmp >= 73 && tmp < 101) {
				System.out.println("Hot");
			}
			else {
				System.out.println("Ice on my head");
			}
			scanner.close();
			
			}
}

