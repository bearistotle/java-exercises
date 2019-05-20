package exercises;
import java.util.Scanner;

public class CMtoFeetandInches {
    public static void main(String[] args){
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);
        System.out.print("How many centimeters? ");
        cm = in.nextDouble();
        inches = (int) (cm/CM_PER_INCH);
        feet = inches / INCHES_PER_FOOT;
        remainder = inches % INCHES_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }
}
