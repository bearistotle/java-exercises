package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        float miles = in.nextFloat();
        System.out.println("How many gallons of gas did you use?");
        float gallons = in.nextFloat();
        float mpg = miles / gallons;
        System.out.println("You got " + mpg + " miles/gallon.");
    }
}
