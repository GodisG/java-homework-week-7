package program10;
//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        System.out.println("Input the calculation symbol +, -, *, or / ");

        Scanner input = new Scanner(System.in);

        char n = input.next().charAt(0);

        System.out.println("Enter First Number:  ");
        float a = input.nextFloat();
        System.out.println("Enter Second Number:  ");
        float b = input.nextFloat();
input.close();

        if (n == '+') {
            System.out.println(a + "+" + b + " = " + (a+b));
        } else if (n == '-') {
            System.out.println(a + "-" + b + " = " + (a-b));
        }else if (n == '*') {
            System.out.println(a + "*" + b + " = " + (a*b));
        }  else if (n == '/') {
            System.out.println(a + "/" + b + " = " + (a/b));
        }
    }
}
