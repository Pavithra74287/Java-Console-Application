package Library_book;
import java.util.*;
public class User 
{
	private int user_id;
	private String user_name;
	private ArrayList<Book> borrowedBooks;
	
	public User(int id,String name)
	{
		this.user_id=id;
		this.user_name=name;
		this.borrowedBooks=new ArrayList<>();
	}
	
	public int getuser_id()
	{
	 return this.user_id;
	}
	public void setuser_id(int id)
	{
	  this.user_id=id;
	}
	public String getuser_name()
	{
		return this.user_name;
	}
	public void setuser_name(String name)
	{
	  this.user_name=name;
	
	}
	public ArrayList<Book> getBorrowedBooks() 
	{
		return borrowedBooks;
	}
    public void borrowBook(Book book) 
    {
    	borrowedBooks.add(book);
	}
    public void returnBook(Book book) 
    {
    	borrowedBooks.remove(book);
    }
}