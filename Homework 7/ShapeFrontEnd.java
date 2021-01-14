//written by Timothy Gedney
import java.util.Scanner;

public class ShapeFrontEnd {
	
	static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		ShapeCollection shapes = new ShapeCollection();
		System.out.println("Welcome to the Shapes Collection.");
		boolean repeat = true;
		
		while (repeat) {
			System.out.print("\nEnter 1: Add a shape\nEnter 2: Remove a shape\n"
					+ "Enter 3: Quit\nEnter a selection: ");
			int choice = input.nextInt();
			while (choice < 1 || choice > 3) {
				System.out.print("Invalid input, enter a selection: ");
				choice = input.nextInt();
			}
			switch (choice) {
			case 1: {
				shapes.addShape(makeShapeDialog());
				shapes.sortShapes();
				break;
			}			
			case 2: {
				System.out.print("\nEnter the shape's type: ");
				input.nextLine();
				String type = input.nextLine();
				System.out.print("Enter the shape's area: ");
				double area = input.nextDouble();
				shapes.removeShape(type, area);
				break;
			}			
			case 3: {
				System.out.print("Goodbye.");
				System.exit(0);
				break;
			}
			}
			System.out.println("\nCurrent Collection: ");
			shapes.printShapes();
		}
	}
	
	public static Shape makeShapeDialog() {
		Shape shape;
		System.out.print("\nWould you like to add a rectangle, triangle, or circle: ");
		String choice = input.next().toUpperCase();
		while (choice.compareToIgnoreCase("Rectangle") != 0 && choice.compareToIgnoreCase("Triangle") != 0 && choice.compareToIgnoreCase("Circle") != 0) {
			System.out.print("Invalid input, enter a selection: ");
			choice = input.next();
		}		
		switch (choice) {
		case "RECTANGLE":
			System.out.print("Enter the length and width: ");
			double length = input.nextDouble();
			double width = input.nextDouble();
			shape = new Rectangle(length, width);
			break;
		case "TRIANGLE":
			System.out.print("Enter the base and height: ");
			double base = input.nextDouble();
			double height = input.nextDouble();
			shape = new Triangle(base, height);
			break;
		case "CIRCLE":
			System.out.print("Enter the radius: ");
			double radius = input.nextDouble();
			shape = new Circle(radius);
			break;
		default:
			shape = new Rectangle();
		}
		
		return shape;
	}
}
