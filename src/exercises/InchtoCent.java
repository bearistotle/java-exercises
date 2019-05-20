package exercises;
import java.util.Scanner;

public class InchtoCent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");
        int inches = in.nextInt();
        final double CM_PER_INCH = 2.54;
        double cm = inches * CM_PER_INCH;
        System.out.println(inches + " inches is " + cm + " centimeters.");
    }
}
