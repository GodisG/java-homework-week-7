package program18;
//Write a Java program to sum values of an array.

public class SumValue {
    public static void main(String[] args) {
        int array[] = {10,15,25,35,45,55,65,75,85};
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("The sum is " +sum);
    }
}
