//written by Timothy Gedney
import java.util.*;
import java.io.*;

public class AEIOUCounter {
	
	public static void main(String[] args) {
		try {
			System.out.println("Enter a file name and I will say how many times AEIOU appears in order.");
			Scanner input = new Scanner(System.in);
			String filename = input.nextLine();
			Scanner fileScanner = new Scanner(new File(filename));
			
			//read file & construct string
			String s = "";
			while (fileScanner.hasNext()) {
				s += fileScanner.next().toUpperCase();
			}
			
			//counting
			int aeiouCounter = 0;
			int vowelCounter = 0;
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'A' && vowelCounter == 0 || c == 'E' && vowelCounter == 1 || c == 'I' && vowelCounter == 2 || c == 'O' && vowelCounter == 3) {
					vowelCounter++;
				} else if (c == 'U' && vowelCounter == 4) {
					aeiouCounter++;
					vowelCounter = 0;
				} else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					vowelCounter = 0;
				}
			}
			fileScanner.close();
			input.close();
			
			System.out.println("The file " + filename + " has \"AEIOU\" appearing in order " + aeiouCounter + " times.");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
