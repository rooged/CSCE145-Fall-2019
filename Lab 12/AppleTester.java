//written by Timothy Gedney

public class AppleTester {

	public static void main(String[] args) {
		
		System.out.println("Welcome to apple tester.");
		System.out.println("\nCreating a default apple.\nPrinting the default apple's value.");
		Apple apple1 = new Apple();
		System.out.println(apple1);

		System.out.println("\nCreating a valid apple using the values \"Granny Smith, 0.75, 0.99\".");
		Apple apple2 = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println(apple2);
		
		System.out.println("\nCreating an invalid apple using the values \"iPad, 2.5, -200\".");
		Apple apple3 = new Apple("iPad", 2.5, -200);
		System.out.println(apple3);
		System.out.println("Printing out this apple's type: " + apple3.getType());
		
		System.out.println();
		Apple apple4 = new Apple();
		System.out.println("Does the first apple match this new apple? " + apple1.equals(apple4));
		System.out.println("Does the second apple match the third apple? " + apple2.equals(apple3));

	}

}
