/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rushd
 */
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class ArithmeticErrorException extends Exception {
    public ArithmeticErrorException(String message) {
        super(message);
    }
}


public class ExceptionHandlingDemo {

    public static double divide(int numerator, int denominator) throws DivisionByZeroException, ArithmeticErrorException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Error: Division by zero is not allowed.");
        }

       
        if (denominator == Integer.MIN_VALUE && numerator == -1) {
            throw new ArithmeticErrorException("Error: Arithmetic overflow occurred.");
        }

        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
           
            System.out.println("Result: " + divide(10, 0)); 
        } 
        catch (DivisionByZeroException e) 
        {
            System.out.println(e.getMessage());
        } catch (ArithmeticErrorException e) {
            System.out.println(e.getMessage());
        }

        try {
                 System.out.println("Result: " + divide(-1, Integer.MIN_VALUE)); // This will throw ArithmeticErrorException
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticErrorException e) {
            System.out.println(e.getMessage());
        }

        try {
           
            System.out.println("Result: " + divide(10, 2)); 
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}


