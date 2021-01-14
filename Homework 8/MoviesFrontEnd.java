//written by Timothy Gedney
import java.util.*;
import java.io.*;

public class MoviesFrontEnd {

	public static void main(String[] args) {
		//initialize things
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the movie database.");
		Movie movie;
		MovieDatabase movies = new MovieDatabase();
		boolean repeat = true;
		
		//repeating loop to continue everything till user exits
		while (repeat) {
			System.out.println("\nEnter the number of what you'd like to do: ");
			System.out.println("1. Add a movie\n2. Remove a movie\n3. Find all movies by a director\n4. Sort the database alphabetically by title"
					+ "\n5. Sort the database by ratings\n6. Sort the database by box office gross\n7. Print the database to a file"
					+ "\n8. Read from a database file\n9. Quit");
			int choice = input.nextInt();
			
			//user choice
			switch (choice) {
			//add a movie
			case 1: {
				System.out.println("Enter the movies title, year of release, rating (1-5), director, and box office gross (millions):");
				input.nextLine();
				String name = input.nextLine();
				int year = input.nextInt();
				double rating = input.nextDouble();
				input.nextLine();
				String director = input.nextLine();
				double gross = input.nextDouble();
				movie = new Movie(name, year, rating, director, gross);
				movies.addMovie(movie);
				movies.print();
				break;
			}
			//remove a movie by title
			case 2: {
				System.out.print("Enter the movie's title that you'd like removed: ");
				input.nextLine();
				String name = input.nextLine();
				movies.removeMovie(name);
				movies.print();
				break;
			}
			//print out all movies by a director
			case 3: {
				System.out.print("Enter the directors name: ");
				input.nextLine();
				String director = input.nextLine();
				movies.findDirector(director);
				break;
			}
			//sort array by title
			case 4: {
				movies.sortTitle();
				movies.print();
				break;
			}
			//sort array by rating
			case 5: {
				movies.sortRating();
				movies.print();
				break;
			}
			//sort array gross
			case 6: {
				movies.sortGross();
				movies.print();
				break;
			}
			//print out the array to a file
			case 7: {
				movies.printToFile();
				System.out.println("The database file is updated.");
				break;
			}
			//read from the database file
			case 8: {
				try {
					//written to read from a file with the exact same structure as the toString of the movies
					//format of each movie must follow this format in file (one per line):
					//Name: xxxx, Year: xxxx, Rating: xxxx, Director: xxxx, Box Office Gross: xxxx
					Scanner fileScanner = new Scanner(new File("MovieDatabase.txt"));
					String[] list = new String[500];
					for (int i = 0; fileScanner.hasNextLine(); i++) {
						list[i] = fileScanner.nextLine();
					}
					
					//for loop of the string array that creates substrings to separate everything into their respective variables
					for (int i = 0; i < list.length; i++) {
						if (list[i] != null) {
							String s = list[i];
						
							//name
							int indexNameB = s.indexOf(' ');
							int indexNameE = s.indexOf(',');
							String name = s.substring(indexNameB + 1, indexNameE);
						
							//year
							int indexYearB = s.indexOf(':', indexNameE + 1);
							int indexYearE = s.indexOf(',', indexYearB);
							int year = Integer.parseInt(s.substring(indexYearB + 2, indexYearE));
							
							//rating
							int indexRatingB = s.indexOf(':', indexYearE);
							int indexRatingE = s.indexOf(',', indexRatingB);
							double rating = Double.parseDouble(s.substring(indexRatingB + 2, indexRatingE));
							
							//director
							int indexDirectorB = s.indexOf(':', indexRatingE);
							int indexDirectorE = s.indexOf(',', indexDirectorB + 1);
							String director = s.substring(indexDirectorB + 2, indexDirectorE);
							
							//gross
							int indexGrossB = s.indexOf('$', indexDirectorE);
							int indexGrossE = s.indexOf(' ', indexGrossB + 1);
							double gross = Double.parseDouble(s.substring(indexGrossB + 1, indexGrossE));
						
							movie = new Movie(name, year, rating, director, gross);
							movies.addMovie(movie);
						}
					}
					movies.print();
					fileScanner.close();
				}
				catch (Exception e) {
					System.out.println(e);
				}
				break;
			}
			//exit
			case 9: {
				repeat = false;
				break;
			}
			}
		}
		System.out.println("Goodbye.");
		input.close();
	}
}
