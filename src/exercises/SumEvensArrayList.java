package exercises;
import java.util.ArrayList;
public class SumEvensArrayList {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        int sum;
        for (Integer i = 0; i < 100; i++){
            integers.add(i);
        }
        sum = SumEvens(integers);
        System.out.print(sum);

    }

    public static Integer SumEvens(ArrayList<Integer> integers){
        int sum = 0;
        for (Integer i : integers){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
