package exercises;

public class RectangleArea {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("What is the length?");
        int length = in.nextInt();
        System.out.println("What is the width?");
        int width = in.nextInt();
        System.out.println("The area is: " + length * width);
    }
}
