import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the variables
        final double PI = 3.14;
        double radius, area;

        // Create a Scanner Object
        Scanner inputRadius = new Scanner(System.in);

        // Prompt user to enter radius and store value
        System.out.print("Enter radius: ");
        radius = inputRadius.nextDouble();

        // Compute area
        area = PI * (Math.pow(radius, 2));

        // Display area
        System.out.println("The area of Circle: " + area);

        // Random Values
        double randomValue = Math.random();
        int randomIntValue = (int)(Math.random() * 10);
        System.out.println(randomIntValue);
    }
}