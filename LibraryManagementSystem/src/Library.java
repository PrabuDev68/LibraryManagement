
import java.util.ArrayList;
import java.util.List;
public class Library {
	private List<Books> book = new ArrayList<>();
    
	public void addBook(Books b)
	{
		book.add(b);
	}
	
	public void removeBook(String name)
	{
		Books rem = new Books();
		rem = searchBooks(name);
		book.remove(rem);
	}
	
	public void displayBooks()
	{
		for(Books i:book)
		{
			System.out.println(i.getTitle());
		}
	}
	
	public Books searchBooks(String title)
	{
		for(Books i:book)
		{
			if(i.getTitle().equals(title))
			{
				return i;
			}
			
		}
		return null;
	}

}
