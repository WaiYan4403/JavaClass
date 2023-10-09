import java.util.Scanner;

public class BankSimulator {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        while (true){
            System.out.println("\n\nWhat would you like to do?");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit\n");

            Scanner inputChoice = new Scanner(System.in);
            int userChoice;

            do{
                System.out.print("Your choice: ");
                userChoice = inputChoice.nextInt();
                if(userChoice > 4 || userChoice <= 0){
                    System.out.println("You didn't choose a valid option, please try again.");
                }
            }while (userChoice > 4 || userChoice <= 0);

            if(userChoice == 1){
                //Display customer's balanceeghuj
                bankAccount.checkBalance();
            }
            else if(userChoice == 2){
                Scanner inputAmount = new Scanner(System.in);
                int amount;
                do{
                    System.out.print("Please, enter your withdraw amount: ");
                    amount = inputAmount.nextInt();
                    if(amount > bankAccount.balance || amount <= 0){
                        System.out.println("Please choose a valid amount");
                    }
                }while (amount > bankAccount.balance || amount <= 0);

                if(bankAccount.balance - amount < 30){
                    //Customer's balance need at least $30
                    System.out.println("Transaction failed!!\nYour account need at least $30");
                }
                else{
                    //Withdraw success
                    bankAccount.withdraw(amount);
                    System.out.println("Withdraw success!!");
                    bankAccount.checkBalance();
                }
            }
            else if(userChoice == 3){
                Scanner inputAmount = new Scanner(System.in);
                int amount;
                do{
                    System.out.print("Please, enter your deposit amount: ");
                    amount = inputAmount.nextInt();
                    if(amount <= 0){
                        System.out.println("Please choose a valid amount");
                    }
                }while (amount <= 0);

                bankAccount.deposit(amount);
                System.out.println("Deposit success!!");
                bankAccount.checkBalance();
            }
            else{
                break;
            }
        }
    }
}
