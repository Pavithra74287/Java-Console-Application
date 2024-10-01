package Library_book;
import java.util.*;
public class Book 
{
	private int book_id;
	private String book_name;
	private String author_name;
	private int yearofpublish;
	private boolean b;
	
	public Book(int id,String name,String author_name,int year,boolean bln)
	{
		this.book_id=id;
		this.book_name=name;
		this.author_name=author_name;
		this.yearofpublish=year;
		this.b=bln;
	}
	
	public int getbook_id()
	{
		return this.book_id;
	}
	public String getbook_name()
	{
		return this.book_name;
	}
	public int getbook_author()
	{
		return this.book_id;
	}
	public int getyearOfPublish()
	{
		return this.yearofpublish;
	}
	public void setbook_id(boolean b1)
	{
		this.b=b1;
	}
}