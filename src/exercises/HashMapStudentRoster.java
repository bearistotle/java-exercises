package exercises;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/** Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers) instead
 *of names and grades. In this case, however, the keys should be integers (the IDs) and the values should be strings
 *(the names). Modify the roster printing code accordingly. */

public class HashMapStudentRoster {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String newStudent = " ";
        BigInteger newID;
        HashMap<BigInteger, String> roster = new HashMap<>();

        while (!newStudent.equals("")){
            System.out.print("Name of Student (Hit ENTER if no more): ");
            newStudent = scan.nextLine();
            if (!newStudent.equals("")){
                System.out.print("ID of Student: ");
                BigInteger id = scan.nextBigInteger();
                roster.put(id, newStudent);
                scan.nextLine();
            }
        }

        System.out.println("\nClass Roster: ");

        for (Map.Entry<BigInteger, String> student : roster.entrySet()){
            System.out.println("ID: " + student.getKey() + " Name: " + student.getValue());

        }
    }
}
