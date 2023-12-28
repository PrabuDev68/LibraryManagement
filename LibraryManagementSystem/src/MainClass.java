import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
		Library library = new Library();
		Librarian librarian1 = new Librarian("Raja",library);
		long bookId;
		String title;
		String author;
        int choice;
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
    		System.out.println("Welcome to Librarian portal");
    		System.out.println("Please Enter the option you need to perform :");
    		System.out.println(" 1.  Add  a  Book");
    		System.out.println(" 2.  Remove  a  Book");
    		System.out.println(" 3.  Search  a  Book");
    		System.out.println(" 4.  Display  all  the  Books");
    		
    		choice = sc.nextInt();
    		
    		switch(choice)
    		{   
    		case 1:
    			System.out.println("Enter name of the book:");
    			title = sc.next();
    			System.out.println("Enter book ID:");
    			bookId = sc.nextLong();
    			System.out.println("Enter the name of the author:");
    			author = sc.next();
    			Books b = new Books(bookId,title,author);
    			librarian1.addBook(b);
    			break;
    			
    		case 2:
    			System.out.println("Enter the name of book you want to remove");
    			title = sc.next();
    			librarian1.removeBook(title);
    			break;
    		case 3:
    			System.out.println("Enter the name of book you want to search");
    			title = sc.next();
    			librarian1.searchBooks(title);
    			break;
    		case 4:
    			System.out.println("The Books in the Library are :");
    			librarian1.displayBooks();
    			break;

    		}
        }

		
		
		
		
	}
}
