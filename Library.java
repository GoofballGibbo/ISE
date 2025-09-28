import java.util.*;

public class Library {
   public static void main(String[] args) {
      Library library = new Library();
      Book b1 = new Book("Sapiens", "Yuval Noah Harari", "1231231", true);
      library.addBook(b1);
      b1.printDetails();
   
   }
   private ArrayList<Book> books;
   
   public Library() {
      books = new ArrayList<>();
   }
   
   public void addBook(Book book) {
      books.add(book);
      System.out.printf("Book added: %s%n", book.getTitle());
      
   }

  

}

class Book {
   private String title;
   private String author;
   private String ISBN;
   private boolean availability;
   
   public Book(String title, String author, String ISBN, boolean availability) {
      this.title = title;
      this.author = author;
      this.ISBN = ISBN;
      this.availability = availability;
   }
   
   public String getTitle() {
      return title;
   }
   
   public String getAuthor() {
      return author;
   }
   
   public String getISBN() {
      return ISBN;
   }
   
   public boolean isAvailable() {
      return availability;
   }
   
   public void setAvailability(boolean availability) {
      this.availability = availability;
   }
   
   public void printDetails() {
      System.out.printf("Title: %s | Author: %s | ISBN: %s | Availability: %s%n", title, author, ISBN, availability);
   } 
}

