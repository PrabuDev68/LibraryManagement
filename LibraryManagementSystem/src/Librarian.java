
public class Librarian {
	private String name;
	private Library library; 
	
	public Librarian() {
		
	}
	
	public Librarian(String name,Library library)
	{
		this.name = name;
		this.library = library;
	}
	
	public void addBook(Books b)
	{
		Books k = library.searchBooks(b.getTitle());
		if(k!= null)
		{
			k.incAvailability();
		}
		else {
			library.addBook(b);
		}
		
	}
	
	public void removeBook(String name)
	{
		Books s = library.searchBooks(name);
		if(s == null)
		{
			System.out.println("The books is not present in the library");
		}
		else if(s.getAvailability() == 1)
		{
			library.removeBook(name);
		}
		else
		{
			s.decAvailability();
		}
	}
	
	public void displayBooks()
	{
		library.displayBooks();
	}
	
	public void searchBooks(String title)
	{
		Books b = library.searchBooks(title);
		if(b == null)
		{
			System.out.println("The Book you have entered is not present in the library");
		}
		else
		{
			System.out.println("Book id = " + b.getId());
		}
	}

	

	
}
