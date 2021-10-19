package program19;
//Write a Java program to calculate the average value of array elements.

public class AverageValue {
    public static void main(String[] args) {
        int[] num = new int[] {5, 10, 15, 20, 25};
        int sum = 0;
        for (int i=0; i< num.length; i++)
            sum = sum + num [i];
        double average = sum/ num.length;
        System.out.println("Average value of the array elements is: " +average);
    }
}
