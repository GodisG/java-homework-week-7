package program4;
//Number of Days In Month
//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
//Example of input/Output:
//● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
//● isLeapYear(1600); should return true since 1600 is a leap year
//● isLeapYear(2017); should return false since 2017 is not a leap year
//● isLeapYear(2000);should return true because 2000 is a leap year
//Write another method getDaysInMonth with two parameter month and year. Both of type
//int.
//If parameter month is < 1 or >12 return -1.
//If parameter year is <1 or >9999 than return -1.
//This method needs to return the number of days in the month. Be careful about leap years
//they have 29 days in month 2 (February).
//You should check if the year is a leap year using the method isLeapYear describe above.
//Example of input/Output:
//● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
//● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
// year.
//● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
// 2018 is not a leap year.
//● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
//● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
// 9999
//HINT: Use the switch statement.
//NOTE: Methods isLeapYear and getDaysInMonth need to be public static
import java.time.Year;
import java.util.Scanner;
public class NoOfDaysInMonth {


    public static boolean isLeapYear(int year) {
        boolean b;
        if (year <= 1 || year >= 9999) {
            b = false;
            System.out.println(b + " Since parameter is not in range");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            b = true;
            System.out.println(b + "Since" + year + "is a leap year");
        } else {
            b = false;
            System.out.println(b + "Since" + year + "is not a leap year");
        }
        return b;
    }

        /*boolean isLeap = false;

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a year");
        year = obj.nextInt();

        if (year >= 1 && year <= 9999) {
            System.out.println("True");
        } else
            System.out.println("False, out of range");

        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap == true)
            System.out.println(+year + "is a leap year");
        else
            System.out.println(+year + "is not a leap year");

    }*/
    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            System.out.println("-1 - Invalid Month");
        } else if (year < 1 || year > 9999)
            System.out.println("-1 - Invalid Year");

        switch (month) {
            case 1:
                System.out.println("Month is January with 31 days and ");
                isLeapYear(year);
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Month is February with 29 days and ");
                    isLeapYear(year);
                } else {
                    System.out.println("Month is February with 28 days and ");
                    isLeapYear(year);
                    break;
                }
            case 3:
                System.out.println("Month is March with 31 days and ");
                isLeapYear(year);
                break;
            case 4:
                System.out.println("Month is April with 30 days and ");
                isLeapYear(year);
                break;
            case 5:
                System.out.println("Month is May with 31 days and ");
                isLeapYear(year);
                break;
            case 6:
                System.out.println("Month is June with 30 days and ");
                isLeapYear(year);
                break;
            case 7:
                System.out.println("Month is July with 31 days and ");
                isLeapYear(year);
                break;
            case 8:
                System.out.println("Month is August with 31 days and ");
                isLeapYear(year);
                break;
            case 9:
                System.out.println("Month is September with 30 days and ");
                isLeapYear(year);
                break;
            case 10:
                System.out.println("Month is October with 31 days and ");
                isLeapYear(year);
                break;
            case 11:
                System.out.println("Month is November with 30 days and ");
                isLeapYear(year);
                break;
            case 12:
                System.out.println("Month is December with 31 days and ");
                isLeapYear(year);
                break;
        }
        return 0;
    }
        public static void main(String[]args){
            isLeapYear(-1600);
            isLeapYear(1600);
            isLeapYear(2017);
            isLeapYear(2000);
            getDaysInMonth(1, 2020);
            getDaysInMonth(2, 2020);
            getDaysInMonth(2, 2018);
            getDaysInMonth(-1, 2020);
            getDaysInMonth(1, -2020);

            }
    }


