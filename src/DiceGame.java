import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        //Variables
        int totalPoints = 100;
        int betAmount;

        //Create Scanner Object
        Scanner inputBetAmount = new Scanner(System.in);

        while (totalPoints > 0) {
            //Display total points
            System.out.println("Total points: " + totalPoints);

            //Prompt user to enter a bet amount
            do {
                System.out.print("Enter Bet Amount: ");
                betAmount = inputBetAmount.nextInt();
            } while (betAmount > totalPoints || betAmount < 0);

            //Display user's bet amount
            System.out.println("Your Bet Amount: " + betAmount);

            //Roll dice
            int diceValue = 1 + (int) (Math.random() * 6);

            //Display Dice value
            System.out.println("Dice value: " + diceValue);

            //Change Total points
            if (diceValue == 1 || diceValue == 2) {
                totalPoints -= betAmount;
            } else if (diceValue == 3) {
                //Draw
            } else if (diceValue == 4 || diceValue == 5) {
                totalPoints += betAmount;

            } else if (diceValue == 6) {
                totalPoints += betAmount * 2;
            }
        }
    }
}

