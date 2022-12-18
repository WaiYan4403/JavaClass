import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner inputGrade = new Scanner(System.in);

        //Prompt user to enter their score
        System.out.print("Enter number: ");
        long userDigit = inputGrade.nextLong();

        //Display user's grade
        System.out.print("The sum is " + sumDigits(userDigit));
    }

    public static int sumDigits(long n){
        int remainder;
        int result = 0;

        while (n > 0){
            remainder = (int) n % 10; //Extract digit
            result += remainder; //Sum digit

            n = n / 10; //Remove digit
        }

        return result;
    }
}
