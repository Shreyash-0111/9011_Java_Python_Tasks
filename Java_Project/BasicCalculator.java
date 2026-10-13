//Program to calculate basic arithmetic operations

import java.util.Scanner;

public class BasicCalculator {

    public double add(double num1, double num2){
        return num1+num2;
    }
    public double substract(double num1, double num2){
        return num1-num2;
    }
    public double multiply(double num1,double num2){
        return num1*num2;
    }
    public double divide(double num1,double num2){
        if(num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1/num2;
    }
    public double modulus(double num1,double num2){
        if(num2 == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return num1%num2;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select operation: +, -, *, /, %");
        String operation = sc.next();

        double result;

        switch (operation) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.substract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            case "%":
                result = calculator.modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid operation selected.");
                return;
        }

        System.out.println("Result: " + result);
    }

}
