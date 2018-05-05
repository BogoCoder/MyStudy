
public class LibraryRecord 
{
	
	public LibraryRecord(String title, String author, String publisher, int year,  double number)
	{
		bookTitle = title;
		bookAuthor = author;
		bookNumber = number;
		bookPublisher = publisher;
		bookYear = year;
		Circulating = true;
	}
	
	public LibraryRecord(String title, String author, String publisher, int year,  double number, boolean circulating)
	{
		bookTitle = title;
		bookAuthor = author;
		bookNumber = number;
		bookPublisher = publisher;
		bookYear = year;
		Circulating = circulating;
	}
	
	public String getTitle()
	{
		return bookTitle;
	}
	
	public String getAuthor()
	{
		return bookAuthor;
	}
	
	public String getPublisher()
	{
		return bookPublisher;
	}
	
	public double getNumber()
	{
		return bookNumber;
	}
	
	public int getYear()
	{
		return bookYear;
	}
	
	public void setCirculating(boolean flag)
	{
		Circulating = flag;
	}
	
	public boolean getCirculation()
	{
		return Circulating;
	}

	public String toString()
	{
		return bookTitle + ", " + bookAuthor + ", " + bookPublisher + ", " + bookYear + ", " + "(#" + bookNumber + ")";
	}
	
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private double bookNumber;
	private int bookYear;
	private boolean Circulating;
}
