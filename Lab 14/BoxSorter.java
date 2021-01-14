//written by Timothy Gedney
import java.util.Scanner;

public class BoxSorter {

	public static void main(String[] args) {
		
		//initialize box array and variables
		Scanner input = new Scanner(System.in);
		Box[] boxes = new Box[5];
		System.out.println("Welcome to box sorter.");
		String label;
		double length, width, height;
		
		//creates 5 instances of the box from user input
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the label, length, width, and height for box " + (i + 1) + ":");
			label = input.nextLine();
			length = input.nextDouble();
			width = input.nextDouble();
			height = input.nextDouble();
			input.nextLine();
			Box box = new Box(label, length, width, height);
			boxes[i] = box;
		}
		
		//sorts from smallest to largest
		for (int i = 1; i < boxes.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (boxes[i].getVolume() < boxes[j].getVolume()) {
					Box box1 = boxes[i];
					boxes[i] = boxes[j];
					boxes[j] = box1;
				}
			}
		}
		
		//outputs sorted array
		System.out.println("\nHere's the sorted boxes: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(boxes[i]);
		}
		
		input.close();
	}
}
