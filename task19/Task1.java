package task19;
//Create an interface Shape with an abstract method calculateArea().
interface Shape {
    double calculateArea();
}
//Create a class Circle that implements the Shape interface. The class has a private field radius and a
//constructor that takes a radius as a parameter. The class has a method getRadius() that returns
//the radius and a method calculateArea() that returns the area of the circle using the formula π
//r^2. The class has a method setRadius() that sets the radius of the circl
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //The method getRadius() returns the radius of the circle.
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
        
        // TODO Auto-generated method stub
    }
}

public class Task1 {
    
}
