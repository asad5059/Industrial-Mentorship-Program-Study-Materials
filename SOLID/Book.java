public class Book {
    private String title;
    private String author;
    private int pageCount;
    
    // getter and setter methods for title, author, and pageCount
    
    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page count: " + pageCount);
    }
}