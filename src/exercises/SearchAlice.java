package exercises;

import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting" +
                          "by her sister on the bank, and of having nothing to" +
                          "do: once or twice she had peeped into the book her" +
                          " sister was reading, but it had no pictures or " +
                          "conversations in it, 'and what is the use of a book,'" +
                          "thought Alice 'without pictures or conversation?'";
        System.out.println("What word should I search for?");
        String searchTerm = in.next().toLowerCase();
        if (sentence.toLowerCase().contains(searchTerm)){
            System.out.println(searchTerm + " is in the sentence.");
        } else {
            System.out.println(searchTerm + " is not in the sentence.");
        }
    }
}
