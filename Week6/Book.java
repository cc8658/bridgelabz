public class Book {
    private static String libraryName;
    
    private final String isbn;
    
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Library: " + libraryName+"\n");
        } else {
            System.out.println("Error: The provided object is not a Book instance.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }


    public static void main(String[] args) {
        Book.setLibraryName("Central Public Library");
        Book.displayLibraryName();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        book1.displayBookDetails(book1);
        String test = "Not a book";
        book1.displayBookDetails(test);
    }
}	