//written by Timothy Gedney

public class StringHelperTester {

	public static void main(String[] args) {

		//initialize scanner and create boolean value for loop
		System.out.println("Welcome to the String Helper Tester");
		StringHelper s = new StringHelper();
		
		//checks uniqueness method
		System.out.println("\nTesting if the 'facetiously' has all unique characters: " + s.hasAllUniqueCharacters("facetiously"));
		System.out.println("\nTesting if the 'banana' has all unique characters: " + s.hasAllUniqueCharacters("banana"));
		
		//checks string mesh method
		System.out.println("\nTesting mesh strings with 'harp' and 'fiddle': " + s.meshStrings("harp", "fiddle"));
		
		//checks replacing vowels with 'oodle' method
		System.out.println("\nReplacing all vowels in 'burrito' with 'oodle': " + s.replaceVowelsWithOodle("burrito"));
		
		//checks calculating string weight method
		System.out.println("\nCalculating the weight of 'heavy': " + s.weight("heavy") + "kg");
		System.out.println("\nCalculating the weight of 'light': " + s.weight("light") + "kg");
		
	}

}
