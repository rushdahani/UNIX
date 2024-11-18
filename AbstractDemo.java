/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rushd
 */
abstract class Shape
 {
     public abstract double calculateArea();
    
  
    public abstract double calculatePerimeter();
}

class Circle extends Shape
 {
    private double radius;
    
       public Circle(double radius)
 {
        this.radius = radius;
    }
    
@Override
    public double calculateArea()
 {
        return Math.PI * radius * radius;
    }
    
       @Override
    public double calculatePerimeter()
 {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape 
{
    private double side1, side2, side3;
    
        public Triangle(double side1, double side2, double side3) 
{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double calculateArea() 
{
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
    
    @Override

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
public class AbstractDemo {
        public static void main(String[] args)
 {
        Shape circle = new Circle(5.0);
        
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        
        System.out.println("Circle: ");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        System.out.println("\nTriangle: ");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
