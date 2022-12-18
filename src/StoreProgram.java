import java.util.Arrays;
import java.util.Scanner;

public class StoreProgram {
    public static void main(String[] args) {
        String[] storeItems = {
                "broccoli", "onion", "carrot", "turnip", "mango",
                "bread", "garlic", "celery", "apple", "banana",
                "raisins", "grapes", "lemon", "orange", "potato"
        };
        int[] itemQuantities = {
                23, 5, 7, 15, 2,
                13, 13, 8, 20, 30,
                3, 25, 10, 9, 1
        };
        double[] itemPrices = {
                2.0, 0.89, 0.70, 1.50, 2.99,
                3.45, 1.45, 1.12, 3.99, 0.25,
                4.99, 7.00, 1.75, 1.80, 3.25
        };
        runTransaction(storeItems, itemQuantities, itemPrices);
    }

    //TODO: Setup the method to run the program
    public static void runTransaction(String[] items, int[] quantities,
                                      double[] prices) {
        while (true){
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Display all inventory");
            System.out.println("2. Display inventory with lower than 5 quantity");
            System.out.println("3. Display highest and lowest inventory value items");
            System.out.println("4. Display total inventory value");
            System.out.println("5. Exit\n");

            Scanner inputChoice = new Scanner(System.in);
            int userChoice;

            do{
                System.out.print("Your choice: ");
                userChoice = inputChoice.nextInt();
                if(userChoice > 5 || userChoice <= 0){
                    System.out.println("You didn't choose a valid option, please try again.");
                }
            }while (userChoice > 5 || userChoice <= 0);

            if(userChoice == 1){
                for(int i = 0; i < items.length; i++){
                    System.out.println("Item: " + items[i] + " Quantity: " + quantities[i] + " Price: " + prices[i]);
                }
            }
            else if(userChoice == 2){
                for(int i = 0; i < items.length; i++){
                    if(quantities[i] < 5){
                        System.out.println("Item: " + items[i] + " Quantity: " + quantities[i] + " Price: " + prices[i]);
                    }
                }
            }
            else if(userChoice == 3){
                double lowestPrice = prices[0];
                double highestPrice = prices[0];
                for (int i = 0;i < items.length; i++){
                    if(prices[i] < lowestPrice){
                        lowestPrice = prices[i];
                    }
                    else if(prices[i] > highestPrice){
                        highestPrice = prices[i];
                    }
                }
                for(int i = 0; i < items.length; i++){
                    if(prices[i] == highestPrice){
                        System.out.println("HIGHEST: ");
                        System.out.println("Item: " + items[i] + " Quantity: " + quantities[i] + " Price: " + prices[i]);
                    }
                }
                for(int i = 0; i < items.length; i++){
                    if(prices[i] == lowestPrice){
                        System.out.println("LOWEST: ");
                        System.out.println("Item: " + items[i] + " Quantity: " + quantities[i] + " Price: " + prices[i]);
                    }
                }
            }
            else if(userChoice == 4){
                double totalValue = 0;
                for(int i = 0; i < items.length; i++){
                    totalValue += prices[i];
                }
                System.out.println("Total Inventory Value: " + totalValue);
            }
            else{
                break;
            }
        }
    }
}
