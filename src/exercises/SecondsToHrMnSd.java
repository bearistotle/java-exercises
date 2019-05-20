package exercises;
import java.util.Scanner;

public class SecondsToHrMnSd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int seconds, hours, minutes, remainder;
        final int SECS_PER_HOUR = 3600;
        final int SECS_PER_MIN = 60;
        System.out.println("How many seconds? ");
        seconds = in.nextInt();
        hours = seconds / SECS_PER_HOUR;
        minutes = (seconds % SECS_PER_HOUR) / SECS_PER_MIN;
        remainder = (seconds % SECS_PER_HOUR) % SECS_PER_MIN;
        System.out.printf("%d seconds is %d hours, %d minutes, %d seconds.", seconds, hours, minutes, remainder);

    }
}
