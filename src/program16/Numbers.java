package program16;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number:  ");
        int n = num.nextInt();

        if (n >0){
            System.out.println("The number is positive");
        } else if (n <0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

}
