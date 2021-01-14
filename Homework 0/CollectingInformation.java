//written by Timothy Gedney
import java.util.Scanner;

public class CollectingInformation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Hello User. What is your name?");
		String name = input.nextLine();
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		System.out.println("How tall are you? (In meters)");
		double height = input.nextDouble();
		
		System.out.println("What is your blood type?");
		String blood = input.next();
		
		System.out.println("Are you a cat person? (True/False)");
		String cat = input.next();
		
		System.out.println("Are you a dog person? (True/False)");
		String dog = input.next();
		
		System.out.println("Repitilian shape shifter's are everywhere. Are you one of us? (True/False)");
		String oneOfUs = input.next();
		
		System.out.println("How many kilograms of gold have you hidden from us?");
		double gold = input.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + "m");
		System.out.println("Blood Type: " + blood);
		System.out.println("Cat Person: " + cat);
		System.out.println("Dog Person: " + dog);
		System.out.println("Reptilian Shape Shifter: " + oneOfUs);
		System.out.println("Gold buried on land: " + gold + "kg");

		input.close();
	}

}
