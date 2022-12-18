import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        // Create variables
        double weight;
        double height;
        double BMI;

        //Create Scanner objects
        Scanner inputWeight = new Scanner(System.in);
        Scanner inputHeight = new Scanner(System.in);

        //Prompt user to enter a weight and height
        System.out.print("Enter weight in pounds: ");
        weight = inputWeight.nextDouble();
        System.out.print("Enter height in inches: ");
        height = inputHeight.nextDouble();

        //Compute BMI
        BMI = weight / (Math.pow(height, 2));
        System.out.println("Your BMI is: " + BMI);

        //BMI Interpretation
        if(BMI < 18.5){
            System.out.println("Underweight");
        }
        else if(BMI >= 18.5 && BMI < 25.0){
            System.out.println("Normal");
        }
        else if(BMI >= 25.0 && BMI < 30.0){
            System.out.println("Overweight");
        }
        else if(BMI >= 30){
            System.out.println("Obese");
        }
    }
}
