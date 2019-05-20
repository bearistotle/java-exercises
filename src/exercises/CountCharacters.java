package exercises;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args){
        /* create string */
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula" +
                " scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat." +
                " Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel," +
                " volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        /* call method below on string */
        HashMap<Character, Integer> counts = new HashMap<>();
        counts = charCount(text);

        /* print each entry in HM */
        for (Map.Entry<Character, Integer> count : counts.entrySet()){
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }

    public static HashMap<Character, Integer> charCount(String text){
        /* convert string to char array */
        char[] characters = text.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        /* loop through array; if char var not in HM, create/add it; if char var in HM, increment value */
        for (Character c : characters){
            /* if binarySearch returns index less than 0, search term not in array searched */
            if (!counts.containsKey(c)){
                counts.put(c, 1);
            } else {
                int num = counts.get(c) + 1;
                counts.replace(c, num);
            }
        }
        return counts;
        /* return hashmap */
    }
}
