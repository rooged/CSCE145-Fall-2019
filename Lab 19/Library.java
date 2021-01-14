//written by Timothy Gedney

public class Library {

	//instance variable
	private Book[][] books;
	
	//class variable
	private static final int CLASSES = 10;
	private static final int MAX_BOOKS = 100;
	
	//constructor
	public Library() {
		books = new Book[CLASSES][MAX_BOOKS];
	}
	
	//classIndex
	public static int classIndex(Book book) {
		return (int) (book.getCallNumber() / 100);
	}
	
	//addBook
	public void addBook(Book book) {
		int index = classIndex(book);
		switch (index) {
		case 0:
			book = new ComputerScienceBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 1:
			book = new PhilosophyBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 2:
			book = new ReligionBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 3:
			book = new SocialSciencesBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 4:
			book = new LanguageBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 5:
			book = new ScienceBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 6:
			book = new TechnologyBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 7:
			book = new ArtsBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 8:
			book = new LiteratureBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		case 9:
			book = new HistoryBook(book.getName(), book.getAuthor(), book.getCallNumber());
			break;
		}
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] == null) {
				books[index][i] = book;
				i = 100;
			}
		}
	}
	
	public void removeBook(Book book) {
		int index = classIndex(book);
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null && books[index][i].equals(book)) {
				books[index][i] = null;
			}
		}
	}
	
	public void printBooks() {
		int index = 0;
		System.out.println("Class 000 - Computer Science");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 100 - Philosophy");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 200 - Religion");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 300 - Social Sciences");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 400 - Language");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 500 - Science");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 600 - Technology");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 700 - Arts");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 800 - Literature");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
		index++;
		System.out.println("Class 900 - History");
		for (int i = 0; i < books[index].length; i++) {
			if (books[index][i] != null) {
				System.out.println(books[index][i]);
			}
		}
	}
}
