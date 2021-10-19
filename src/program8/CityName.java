package program8;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Objects;
import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {

       Scanner city= new Scanner(System.in);
       System.out.println("Write first letter of city (A to F only)");

       String a = city.nextLine();

       if (Objects.equals(a.toUpperCase(), "A")) {
           System.out.println("City is Amsterdam");
       }else if (Objects.equals(a.toUpperCase(), "B")) {
           System.out.println("City is Berlin");
       }else if (Objects.equals(a.toUpperCase(), "C")) {
            System.out.println("City is Cannes");
        }else if (Objects.equals(a.toUpperCase(), "D")) {
            System.out.println("City is Donetsk");
        }else if (Objects.equals(a.toUpperCase(), "E")) {
            System.out.println("City is Essen");
        }else if (Objects.equals(a.toUpperCase(), "F")) {
            System.out.println("City is Frankfurt");
        }else {
           System.out.println("Error: Invalid Entry");
       }
       }}


