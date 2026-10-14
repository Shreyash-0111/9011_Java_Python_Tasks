// This is a simple Java application that prints "Hello, World!" and calculates the sum of two integers.

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }

}
