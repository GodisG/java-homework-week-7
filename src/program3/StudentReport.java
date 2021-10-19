package program3;

import java.util.Scanner;
//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
public class StudentReport {
    public static void main(String[] args) {
        String name, Result, Grade;
        int rollNo, Math, Science, English, Total, Percentage, Marks;

        Scanner report = new Scanner(System.in);

        System.out.println("Please enter a name");
        name = report.nextLine();

        System.out.println("Please enter rollNo");
        rollNo = report.nextInt();

        System.out.println("Please enter Marks for Math");
        Math = report.nextInt();
        System.out.println("Please enter Marks for Science");
        Science = report.nextInt();
        System.out.println("Please enter Marks for English");
        English = report.nextInt();

        Total = Math + Science + English;

        if (Math >= 0 && Math <= 100 && Science >= 0 && Science <= 100 && English >= 0 && English <= 100) {

            Percentage = Total / 3;
            if (Math >=35  && Science>=35 && English>=35){
                Result = "Pass";
            } else{
            Result = "Fail";
        }
            Grade = report.nextLine();
            if (Percentage >= 80) {
                Grade = "A+";
            } else if (Percentage >= 60) {
                Grade = "A";
            } else if (Percentage >= 50) {
                Grade = "B";
            } else if (Percentage >= 35) {
                Grade = "C";
            }


            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|          Mark Sheet           |");
            System.out.println("|_______________________________|");
            System.out.println("|  Name      :  "+name+"        |");
            System.out.println("|  Roll No   :  "+rollNo+"      |");
            System.out.println("|_______________________________|");
            System.out.println("|  Subjects  :    Marks         |");
            System.out.println("|_______________________________|");
            System.out.println("|  Math      :  "+Math+"        |");
            System.out.println("|  Science   :  "+Science+"     |");
            System.out.println("|  English   :  "+English+"     |");
            System.out.println("|_______________________________|");
            System.out.println("|  Total     :  "+Total+"       |");
            System.out.println("|_______________________________|");
            System.out.println("|  Percentage:  "+Percentage+"  |");
            System.out.println("|  Result    :  "+Result+"      |");
            System.out.println("|  Grade     :  "+Grade+"       |");
            System.out.println("|_______________________________|");
        }
        else
        {
            System.out.println("Invalid inputs, Marks should be between 0 to 100");
        }report.close();
    }
}

