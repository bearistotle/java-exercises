package exercises;
import java.util.ArrayList;

/* Write a static method to print out each word in a list that has exactly 5 letters. */
public class PrintStringsFromList {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("game");
        words.add("coffee");
        words.add("sleep");
        words.add("catalyst");
        words.add("water");

        for (String word : hasFiveLetters(words)){
            System.out.println(word);
        }

    }

    public static ArrayList<String> hasFiveLetters(ArrayList<String> list){
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        for (String word : list){
            if (word.length() == 5){
                fiveLetterWords.add(word);
            }
        }
        return fiveLetterWords;
    }
}
