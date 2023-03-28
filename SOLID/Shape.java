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