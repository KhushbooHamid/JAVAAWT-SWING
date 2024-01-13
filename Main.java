import java.util.ArrayList;

class Book {
  String title, author, ISBN;
  Boolean availability;

  public Book(String title, String author, String ISBN, Boolean availability) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.availability = availability;
  }

   public void CheckOut()
  {
    availability=false;
  }

    public void CheckIn()
  {
    availability=true;
  }

  public boolean isAvailable()
  {
    return availability;
  }
}

class Library {
  ArrayList<Book> books = new ArrayList<Book>();

  public void addBooks(Book book) {

    books.add(book);
  }

  public void displayABooks() {
   
    for (Book book : books)
    {
      if(book.isAvailable())
      System.out.println(book.title + " " + book.author + " " + book.ISBN + " " + book.availability);
  }
}

 

}

class Main {
  public static void main(String[] args) {
    // Library.addBooks();
    Book book1 = new Book("b1", "a1", "isbn", true);
    Book book2 = new Book("b2", "a1", "isbn", true);

    Library library = new Library();

    library.addBooks(book1);
    library.addBooks(book2);

    library.displayABooks();

  }
}