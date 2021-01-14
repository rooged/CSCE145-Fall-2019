//written by Timothy Gedney
import java.util.Scanner;

public class DresserFrontEnd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the dresser.\nYour clothes "
				+ "may be undergarments, socks, stockings, tops, "
				+ "bottoms, or capes.\nThey come in the colors "
				+ "brown, pink, orange, green, blue, purple, and grey.");
		Dresser dresser = new Dresser();
		boolean repeat = true;
		
		while (repeat) {
			System.out.println("\nEnter 1 to add an item.\n"
					+ "Enter 2 to remove an item.\n"
					+ "Enter 3 to print out the dresser contents.\n"
					+ "Enter 0 to quit.");
			int choice = input.nextInt();
			switch (choice) {
			case 0: {
				repeat = false;

				break;
			}
			case 1: {
				System.out.print("Enter the type: ");
				input.nextLine();
				String type = input.nextLine();
				System.out.print("Enter the color: ");
				String color = input.nextLine();
				Clothing cloth = new Clothing(type, color);
				dresser.add(cloth);
				break;
			}
			case 2: {
				System.out.print("Enter the type: ");
				input.nextLine();
				String type = input.nextLine();
				System.out.print("Enter the color: ");
				String color = input.nextLine();
				Clothing cloth = new Clothing(type, color);
				dresser.remove(cloth);
				break;
			}
			case 3: {
				System.out.println(dresser.print());
				break;
			}
			}
		}
		System.out.print("Goodbye.");
		System.exit(0);
		
		input.close();
	}
}
