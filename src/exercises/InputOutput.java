package exercises;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName);
    }
}
