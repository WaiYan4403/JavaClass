import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //Variables
        double userScore;

        //Create Scanner Object
        Scanner inputGrade = new Scanner(System.in);

        //Prompt user to enter their score
        System.out.print("Enter your score: ");
        userScore = inputGrade.nextDouble();

        //Display user's grade
        System.out.print("Your grade is ");
        printGrade(userScore);
    }

    public static void printGrade(double score){
        if(score >= 90.0)
            System.out.println('A');
        else if(score >= 80.0)
            System.out.println('B');
        else if (score >= 70.0)
            System.out.println('C');
        else if(score >= 60.0)
            System.out.println('D');
        else
            System.out.println('F');
    }
}
