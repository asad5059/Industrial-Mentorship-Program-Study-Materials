Object-Oriented Programming (OOP) is a programming paradigm that is widely used in Java. It is based on the concepts of objects, classes, and inheritance.

Here are the key concepts of OOP in Java:

### 1.Objects: 
Objects are instances of classes that represent real-world entities. They have attributes (data) and behaviors (methods).

### 2.Classes:
Classes are blueprints or templates for creating objects. They define the attributes and methods that objects of that class will have.

### 3.Inheritance: 
Inheritance allows a subclass to inherit the attributes and methods of a superclass. It enables code reuse and promotes code organization.

### 4.Polymorphism: 
Polymorphism allows objects of different classes to be treated as if they are of the same class. This is achieved through method overriding or method overloading.

### 5.Encapsulation: 
Encapsulation is the practice of hiding the implementation details of an object and exposing only the necessary information through methods. It promotes data integrity and security.

Here is an example of a Java class that illustrates these concepts:

```java
public class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
    
    public String getBreed() {
        return this.breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob", 5);
        Dog dog = new Dog("Rufus", 2, "Labrador");
        
        animal.makeSound(); // prints "Animal makes a sound."
        dog.makeSound(); // prints "Dog barks."
        
        System.out.println(animal.getName()); // prints "Bob"
        System.out.println(dog.getName()); // prints "Rufus"
        
        dog.setAge(3);
        System.out.println(dog.getAge()); // prints "3"
    }
}

```

In this example, we have an Animal class that has two attributes (name and age) and two methods (makeSound and getters/setters for name and age). We also have a Dog class that extends the Animal class and has an additional attribute (breed) and an overridden makeSound method.

In the Main class, we create an Animal object and a Dog object and call their methods. We also demonstrate inheritance by calling the getName method on both objects, which is inherited from the Animal class. We also demonstrate encapsulation by using getters and setters to access and modify the age attribute of the Dog object.