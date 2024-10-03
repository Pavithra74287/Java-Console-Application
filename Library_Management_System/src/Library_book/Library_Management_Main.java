package Library_book;
import java.util.*;
public class Library_Management_Main 
{
	    private ArrayList<Book> books= new ArrayList<>();
	    private ArrayList<User> users=new ArrayList<>();
	    
	    public void addBook(Book book) 
	    {
	        books.add(book);
	    }
        public void addUser(User user) {
	        users.add(user);
	    }
        public void borrowBook(User user, int book_id)
        {
            for (Book book : books) 
            {
                if (book.getbook_id() == book_id && book.isavailable()) 
                {
                    user.borrowBook(book);
                    book.setisavailable(false);
                    System.out.println("Book borrowed successfully.");
                    return;
                }
            }
            System.out.println("Book is not available in the Library");
        }

        public void returnBook(User user, int book_id) 
        {
            for (Book book : user.getBorrowedBooks()) 
            {
                if (book.getbook_id() == book_id) 
                {
                    user.returnBook(book);
                    book.setisavailable(true);
                    System.out.println("Book returned successfully.");
                    return;
                }
            }
            System.out.println("You have not borrowed this book.");
        }

        public void viewAvailableBooks() 
        {
            System.out.println("Available Books:");
            for (Book book : books) 
            {
                if (book.isavailable())
                {
                    System.out.println(book);
                }
            }
        }

}