package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double radius;
        double area;
        final double PI = Math.PI;

        System.out.print("What is the radius? ");

        radius = scan.nextDouble();

        while (radius < 0) {
            System.out.println("Radius must be a positive number.");
            System.out.print("Please enter a new number: ");
            radius = scan.nextDouble();
        }
        area = PI * radius * radius;
        System.out.printf("The area of a circle with radius %.2f is %.3f.", radius, area);
    }
}