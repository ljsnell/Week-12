
//this program illustrates a Cat Class with data
import java.util.Scanner;

class Cat {
	String name;
	String breed;
	String fur;
	double weight;
	int age;
	boolean litterbox;
	String toy;
	String mood;
	String food;
}

public class ExampleCatHandler {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		// Create a cat
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		System.out.println("What is the name of your first cat?");
		cat1.name = userinput.nextLine();
		System.out.println("What is the fur color of your first cat?");
		cat1.fur = userinput.nextLine();
		System.out.println("What is the weight of your first cat in lbs?");
		cat1.weight = userinput.nextDouble();

		System.out.println("What is the name of your second cat?");
		cat2.name = userinput.nextLine();
		cat2.name = userinput.nextLine();
		System.out.println("What is the fur color of your second cat?");
		cat2.fur = userinput.nextLine();
		System.out.println("What is the weight of your second cat in lbs?");
		cat2.weight = userinput.nextDouble();

		System.out.println(cat1.name + " has " + cat1.fur + " fur and is " + cat1.weight + " lbs.");
		System.out.println(cat2.name + " has " + cat2.fur + " fur and is " + cat2.weight + " lbs.");

	} // end main line

} // end class
