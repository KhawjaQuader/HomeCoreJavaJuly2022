package hw8_Inheritance;
/*
 * Create a package name "hw8Inheritance" in HW project.
 * Inside the package,
 * a) Create a class "Animal".Implement a method inside the Animal class -- animalInfo and System.out.println("This method is from Animal Class").
 * b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println("This method is from Mammal Class").
 * c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println("This method is from Reptile Class").
 * d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println("This method is from Birds Class"). 
 * e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class").
 * f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println("This method is from Snake Class").
 * g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class").
 * h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class").
 * i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class").
 * Now create a class "AnimalTest". 
 * Under the main method create an object from each class and call their own method by their own object first.
 * Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc.
 * We know, An object Can call other methods if the class is extended, if yes, show all the possible calls.
 * Use Java comments to show single inheritance, multilevel inheritance, Hierarchical inheritance by example form the above.
 * Also, show by java comments who is Parent class and who is child class for at least one class.
 * Organize the code. Push the code in Github. 
 * Paste your github link below.
 */
public class Animal {
	public void animalInfo() {
		System.out.println("This method is from Animal Class");
	}
}
