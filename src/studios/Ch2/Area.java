package studios.Ch2;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) { //main method executes code from class
        Scanner input = new Scanner(System.in); //new creates instance of class
        System.out.println("Enter a radius: "); //asks user for input
        double radius = input.nextDouble(); //stores user input
        double area = Circle.getArea(radius); //imports method from other class in package
        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }
}

