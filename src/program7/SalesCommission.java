package program7;
//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
// Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        int ID, SA, salary;
        String name;
        double Commission;

        Scanner pay = new Scanner(System.in);
        System.out.println("Please enter name");
        name = pay.nextLine();
        System.out.println("Please enter sales id");
        ID = pay.nextInt();
        System.out.println("Please enter Sales Amount");
        SA = pay.nextInt();
        System.out.println("Please enter salary basic");
        salary = pay.nextInt();


        if (SA >= 50000) {
            System.out.println("Commission: " + (50000 * 35) / 100);
        }
        else if (SA >= 30000) {
            System.out.println("Commission: " + (30000 * 20) / 100);
        }
        else if (SA >= 20000) {
            System.out.println("Commission: " + (20000 * 10) / 100);
        }
        else if (SA >= 10000) {
            System.out.println("Commission: " + (10000 * 5) / 100);
        }
        else if (SA < 10000) {
            System.out.println("Commission: " + (10000 * 2) / 100);
        }

        }
}

