The SOLID principles are a set of design principles that help developers create software that is easy to understand, maintain, and extend over time. The acronym SOLID stands for:

        S - Single Responsibility Principle
        O - Open/Closed Principle
        L - Liskov Substitution Principle
        I - Interface Segregation Principle
        D - Dependency Inversion Principle

Here's a brief overview of each principle along with an example in Java:

1.Single Responsibility Principle (SRP): 
A class should have only one reason to change. This means that a class should have only one responsibility or job to do.

Example in Java:

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
        

