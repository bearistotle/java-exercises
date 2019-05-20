package org.launchcode.java.studios;

public class AddFirstLast {
    public static void main(String[] args){
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = new int[5];
        a2[0] = 6;
        a2[1] = 7;
        a2[2] = 8;
        a2[3] = 9;
        a2[4] = 10;

        System.out.println(firstLastSum(a1));
        System.out.println(firstLastSum(a2));

    }
        public static int firstLastSum(int[] array){
            int first = array[0];
            int last = array[array.length - 1];
            return first + last;
        }
}
