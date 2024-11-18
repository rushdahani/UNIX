/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rushd
 */
interface Resizable
 {
    void resizeWidth(int width);
    void resizeHeight(int height);
}


class Rectangle implements Resizable
 {
    private int width;
    private int height;

    public Rectangle(int width, int height)
 {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight()
 {
        return height;
    }

    @Override
    public void resizeWidth(int width)
 {
        this.width = width;
    }
    @Override
    public void resizeHeight(int height) 
{
        this.height = height;
    }

    public int calculateArea() 
{
        return width * height;
    }

    public int calculatePerimeter()
 {
        return 2 * (width + height);
    }

    public void displayDetails()
 {
        System.out.println("Rectangle: ");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
}
public class Interface {
     public static void main(String[] args)
 {
        Rectangle rectangle = new Rectangle(10, 5);
        
        rectangle.displayDetails();
        
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);
        
        rectangle.displayDetails();
    }

}
