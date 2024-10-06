package Library_book;
import java.util.*;
public class Book 
{
	private int book_id;
	private String title;
	private String author_name;
	private int yearofpublish;
	private boolean isavailable;
	public Book(int id, String name, String author_name) {
	    this(id, name, author_name, 0, true);
	}
	
	public Book(int id,String name,String author_name,int year,boolean bln)
	{
		this.book_id=id;
		this.title=name;
		this.author_name=author_name;
		this.yearofpublish=year;
		this.isavailable=bln;
	}
	
	public int getbook_id()
	{
		return this.book_id;
	}
	public String getbook_name()
	{
		return this.title;
	}
	public int getbook_author()
	{
		return this.book_id;
	}
	public int getyearOfPublish()
	{
		return this.yearofpublish;
	}
	public boolean isavailable ()
	{
		return this.isavailable;
	}
	public void setisavailable(boolean b1)
	{
	    isavailable=b1;
	}
	public String toString() {
        return "Book{" +
                "bookId=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author_name + '\'' +
                ", isAvailable=" + isavailable +
                '}';
	}
}