package program9;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.println("Please write first letter of city (A to F only)");

        String a = letter.nextLine();

        switch (a.toUpperCase()) {
           case "A":
            System.out.println("City is Amsterdam");
            break;
            case "B":
                System.out.println("City is Berlin");
            break;
            case "C":
                System.out.println("City is Cannes");
                break;
            case "D":
                System.out.println("City is Denmark");
                break;
            case "E":
                System.out.println("City is Ennes");
                break;
            case "F":
                System.out.println("City is Frankfurt");
                break;
            default:
                System.out.println("Error: Invalid entry");
        }
    }

}
