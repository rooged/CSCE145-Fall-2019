//written by Timothy Gedney
import java.io.*;

public class MovieDatabase {

	//attribute
	private Movie[] movies;
	
	//initialize array
	public MovieDatabase() {
		movies = new Movie[500];
	}
	
	//add a movie to the first null spot in the array
	public void addMovie(Movie movie) {
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] == null) {
				movies[i] = movie;
				return;
			}
		}
		System.out.println("The database is full, could not add movie.");
	}
	
	//remove every movie that matches the title entered
	public void removeMovie(String title) {
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] != null && movies[i].getName().compareToIgnoreCase(title) == 0) {
				movies[i] = null;
				return;
			}
		}
		System.out.println("Could not find the movie.");
	}
	
	//prints out every movie that matches the director entered
	public void findDirector(String director) {
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] != null && movies[i].getDirector().compareToIgnoreCase(director) == 0) {
				System.out.println(movies[i]);
			}
		}
	}
	
	//sorts the array alphabetically
	public void sortTitle() {
		Movie movieTemp;
		for (int i = 0; i < movies.length; i++) {
			for (int j = i + 1; j < movies.length; j++) {
				if (movies[i] != null && movies[j] != null) {
					if (movies[i].getName().compareToIgnoreCase(movies[j].getName()) > 0) {
						movieTemp = movies[i];
						movies[i] = movies[j];
						movies[j] = movieTemp;
					}
				}
			}
		}
	}
	
	//sorts the array based on ratings from high to low
	public void sortRating() {
		Movie movieTemp;
		for (int i = 0; i < movies.length; i++) {
			for (int j = i + 1; j < movies.length; j++) {
				if (movies[i] != null && movies[j] != null) {
					if (movies[i].getRating() < movies[j].getRating()) {
						movieTemp = movies[i];
						movies[i] = movies[j];
						movies[j] = movieTemp;
					}
				}
			}
		}
	}
	
	//sorts the array based on gross from high to low
	public void sortGross() {
		Movie movieTemp;
		for (int i = 0; i < movies.length; i++) {
			for (int j = i + 1; j < movies.length; j++) {
				if (movies[i] != null && movies[j] != null) {
					if (movies[i].getGross() < movies[j].getGross()) {
						movieTemp = movies[i];
						movies[i] = movies[j];
						movies[j] = movieTemp;
					}
				}
			}
		}
	}
	
	//prints out the entire database to the MovieDatabase.txt file (same format that's need to be entered so they can be used interchangeably)
	public void printToFile() {
		try {
			FileWriter fileWriter = new FileWriter(new File("MovieDatabase.txt"));
			PrintWriter writer = new PrintWriter(fileWriter);
			for (int i = 0; i < movies.length; i++) {
				if (movies[i] != null) {
					writer.print(movies[i] + "\n");
				}
			}
			writer.close();
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
	
	//prints out the array to the console when things are added/removed
	public void print() {
		System.out.println("\nMovie Database:");
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] != null) {
				System.out.println(movies[i]);
			}
		}
	}
}
