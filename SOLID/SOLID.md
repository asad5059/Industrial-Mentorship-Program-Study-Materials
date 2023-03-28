# SOLID
The SOLID principles are a set of design principles that help developers create software that is easy to understand, maintain, and extend over time. The acronym SOLID stands for:

        S - Single Responsibility Principle
        O - Open/Closed Principle
        L - Liskov Substitution Principle
        I - Interface Segregation Principle
        D - Dependency Inversion Principle

Here's a brief overview of each principle along with an example in Java:

### 1.Single Responsibility Principle (SRP): 
A class should have only one reason to change. This means that a class should have only one responsibility or job to do.

Example in Java:

```java
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
```

### 2.Open/Closed Principle (OCP): 
Software entities should be open for extension but closed for modification. This means that you should be able to extend the behavior of a class without modifying its source code.

Example in Java:

```java
public interface Shape {
    public double calculateArea();
}

public class Rectangle implements Shape {
    private double length;
    private double width;
    
    // constructor, getter and setter methods for length and width
    
    public double calculateArea() {
        return length * width;
    }
}

public class Circle implements Shape {
    private double radius;
    
    // constructor, getter and setter methods for radius
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

### 3.Liskov Substitution Principle (LSP): 
Subtypes must be substitutable for their base types. This means that any instance of a base class should be able to be replaced by an instance of a derived class without affecting the correctness of the program.

Example in Java:

```java
public class Vehicle {
    public void start() {
        System.out.println("Starting vehicle...");
    }
}

public class Car extends Vehicle {
    public void start() {
        System.out.println("Starting car...");
    }
}

public class Driver {
    public void startVehicle(Vehicle vehicle) {
        vehicle.start();
    }
}

// Example usage
Driver driver = new Driver();
Vehicle car = new Car();
driver.startVehicle(car); // prints "Starting car..."
```

### 4.Interface Segregation Principle (ISP): 
Clients should not be forced to depend on interfaces they do not use. This means that interfaces should be fine-grained and only expose the methods that are relevant to their clients.
Example in Java:

```java
public interface Printable {
    public void print();
}

public class Book implements Printable {
    // implementation of print method
}

public class Magazine implements Printable {
    // implementation of print method
}

public class Newspaper {
    // does not implement Printable
}
```

### 5.Dependency Inversion Principle (DIP): 
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
Example in Java:

```java
public interface PaymentGateway {
    public void processPayment();
}

public class PayPalGateway implements PaymentGateway {
    // implementation of processPayment method using PayPal API
}

public class CreditCardGateway implements PaymentGateway {
    // implementation of processPayment method using credit card API
}

public class Order {
    private PaymentGateway paymentGateway;
    
    public Order(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    
    public void checkout() {
        paymentGateway
    }
}
```