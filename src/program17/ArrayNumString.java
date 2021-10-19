package program17;

import java.util.Arrays;
//Write a Java program to sort a numeric array and a string array.

public class ArrayNumString {
    public static void main(String[] args) {
        int [] array1 = {155, 157 , 294, 234, 397, 852, 654, 120};
        String [] array2 = {"Ann", "Tina", "Lucy", "Kate", "Isa", "Molly", "Zoe"};

        System.out.println("Original numeric array: "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array: "+ Arrays.toString(array1));

        System.out.println("Original string array: "+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array: "+ Arrays.toString(array2));
    }

}
