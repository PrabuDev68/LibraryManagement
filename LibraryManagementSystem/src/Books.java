
public class Books {
	private long bookId;
	private String title;
	private String author;
	private int avail = 0;
	
	public Books() {
		
	}
	
	public Books(long id,String title,String author)
	{
		this.bookId = id;
		this.title = title;
		this.author = author;
	}

	public long getId()
	{
		return this.bookId;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public int getAvailability() {
		return this.avail;
	}
	
	public void incAvailability() {
		avail++;
	}
	
	public void decAvailability() {
		avail--;
	}
}
