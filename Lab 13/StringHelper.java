//written by Timothy Gedney

public class StringHelper {

	//checks for unique nested for loop compares each letter to the one right after it
	public boolean hasAllUniqueCharacters(String s) {
		boolean hasUnique = true;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					hasUnique = false;
					return hasUnique;
				}
			}
		}
		return hasUnique;
	}
	
	//meshes two strings together. first for loop alternates adding one character from each string to the mesh string.
	//once for loop is finished, the if statement checks if b is longer than a and adds the remaining letters to the mesh
	public String meshStrings(String a, String b) {
		String mesh = "";
		for (int i = 0; i < a.length(); i++) {
			mesh += a.charAt(i);
			if (i < b.length()) {
				mesh += b.charAt(i);
			}
		}
		if (a.length() < b.length()) {
			mesh += b.substring(a.length());
		}
		return mesh;
	}
	
	//replaces every vowel with 'oodle'. for statement checks through word indexing every location of a vowel, then a second for statement
	//goes back through using the indexes and uses substrings to separate the string and replace each vowel
	public String replaceVowelsWithOodle(String s) {
		int[] index = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				index[i] = -1;
			}
		}
		int j = 0;
		for (int i = 0; i < index.length; i++) {
			if (index[i] == -1) {
				String substringStart = s.substring(0, j);
				String substringEnd = s.substring(j + 1);
				s = substringStart + "oodle" + substringEnd;
				j += 4;
			}
			j++;
		}
		return s;
	}
	
	//calcalates weight of a word, for loop goes through string and checks for vowels. adds to each count then calcs at end
	public double weight(String s) {
		double consonant = 3.4;
		double vowel = 2.5;
		int cCount = 0;
		int vCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				vCount++;
			} else {
				cCount++;
			}
		}
		double total = (cCount * consonant) + (vCount * vowel);
		
		return total;
	}
	
}
