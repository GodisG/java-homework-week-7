package program20;
//Write a Java program to test if an array contains a specific value

public class SpecificValue {
    public static boolean contains (int[] arr, int item){
        for (int n:arr) {
            if (item == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {255,358,892,152,765,684,463,518,125};

        System.out.println(contains(array1, 152));
        System.out.println(contains(array1, 155));
    }
}
