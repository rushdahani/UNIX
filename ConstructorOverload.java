/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rushd
 */
class Box
 {
    double height;
    double width;
    double depth;
    
 
    public Box(double height, double width, double depth) 
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double volume()
    {
        return height * width * depth;
    }
}


class BoxWeight extends Box
 {
    double weight;
    public BoxWeight(double height, double width, double depth, double weight) 
    {
        super(height, width, depth);
        this.weight = weight;
    }
    
    
    public void displayWeight()
    {
        System.out.println("Weight: " + weight + " kg");
    }
}

class Shipment extends BoxWeight 
{
    double cost;

    public Shipment(double height, double width, double depth, double weight, double cost)
 {
        super(height, width, depth, weight);         this.cost = cost;
    }

  
    public void calculateCost()
 {
       
        cost = volume() * weight * 0.05;    
 }

    public void displayShipmentDetails()
 {
        System.out.println("Shipment Details:");
        System.out.println("Volume: " + volume() + " cubic units");
        displayWeight(); // Call the method from BoxWeight class
        System.out.println("Shipping cost: $" + cost);
    }
}
public class ConstructorOverload {
    public static void main(String[] args)
 {
        Shipment shipment = new Shipment(2, 3, 4, 5, 0);
        
        shipment.calculateCost();
        
        shipment.displayShipmentDetails();
    }

}
