package hw8Inheritance;

/* Now create a class "AnimalTest". 
* Under the main method create an object from each class and call their own method by their own object first.
* Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc.
* We know, An object Can call other methods if the class is extended, if yes, show all the possible calls.
* Use Java comments to show single inheritance, multilevel inheritance, Hierarchical inheritance by example form the above.
* Also, show by java comments who is Parent class and who is child class for at least one class.
* Organize the code. Push the code in Github. 
* Paste your github link below.
*/
public class AnimalTest {
	public static void main(String[] args) {//main method
		Animal animal = new Animal();//class instantiate/object created/constructor initialized
		animal.animalInfo();//animal object is calling animalinfo method from animal class

		System.out.println("\n----------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();//mammal object is calling mammalInfo method from Mammal Class
		mammal.animalInfo();// Single Inheritance & Animal Parent & Mammal child class
		// Also Hierarchical inheritance Animal Parent & Mammal Child                   
		System.out.println("\n----------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();// Single Inheritance & Animal Parent & Reptile child class
		//Also Hierarchical inheritance Animal Parent & Reptile Child
		System.out.println("\n----------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();// Single Inheritance & Animal Parent & Birds child class
		//Also Hierarchical inheritance Animal Parent & Birds Child
		System.out.println("\n----------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();// Mammal Parent & Dog Child
		dog.animalInfo();

		System.out.println("\n----------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();// Reptile Parent & Snake Child
		snake.animalInfo();

		System.out.println("\n----------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();// Birds Parent & Robin Child
		robin.animalInfo();

		System.out.println("\n----------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();// Dog Parent & BullDog child
		bullDog.mammalInfo();// Mammal Parent & Dog Child
		bullDog.animalInfo();// Multilevel Inheritance Animal Parent & Mammal Child

		System.out.println("\n----------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();// Snake Parent & Cobra Child
		cobra.reptileInfo();// Reptile Parent & Snake Child
		cobra.animalInfo();// Multilevel Inheritance Animal Parent & Reptile Child
	}
}
