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
        public static void main(String[] args) {
            Library_Management_Main library = new Library_Management_Main();
            Scanner scanner = new Scanner(System.in);
            //library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
            //library.addBook(new Book(2, "1984", "George Orwell"));
            //library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
            //library.addUser(new User(1, "Alice"));

            while (true) {
                System.out.println("===== Library Management System =====");
                System.out.println("1. View Available Books");
                System.out.println("2. Borrow a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        library.viewAvailableBooks();
                        break;
                    case 2:
                        System.out.print("Enter Book ID to borrow: ");
                        int borrowId = scanner.nextInt();
                        library.borrowBook(library.users.get(0), borrowId); 
                        break;
                    case 3:
                        System.out.print("Enter Book ID to return: ");
                        int returnId = scanner.nextInt();
                        library.returnBook(library.users.get(0), returnId);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }