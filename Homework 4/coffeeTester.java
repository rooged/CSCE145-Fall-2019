//written by Timothy Gedney
import java.util.Scanner;

public class coffeeTester {

	public static void main(String[] args) {

		System.out.println("Welcome to coffee tester!");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nCreate the first coffee. Enter the coffee's name: ");
		Coffee coffee1 = new Coffee();
		String coffeeName1 = input.nextLine();
		coffee1.setName(coffeeName1);
		System.out.print("Enter the caffeine content of the coffee: ");
		double coffeeCaffeine1 = input.nextDouble();
		coffee1.setCaffeine(coffeeCaffeine1);
		
		System.out.print("\nCreate the second coffee. Enter the coffee's name: ");
		Coffee coffee2 = new Coffee();
		input.nextLine();
		String coffeeName2 = input.nextLine();
		coffee2.setName(coffeeName2);
		System.out.print("Enter the caffeine content of the coffee: ");
		double coffeeCaffeine2 = input.nextDouble();
		coffee2.setCaffeine(coffeeCaffeine2);
		System.out.println("\n");

		System.out.println("It would take " + coffee1.RiskyAmount() + " cups of " + coffee1.getName() + " before it's dangerous.");
		System.out.println("It would take " + coffee2.RiskyAmount() + " cups of " + coffee2.getName() + " before it's dangerous.");
		
		System.out.print("\nGoodbye.");
		input.close();
	}

}
