import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Chapter5 {
    public static void main(String[] args) {
        //Create the variables
        final double PI = 3.14;
        double radius, area;

        //Create Scanner Object
        Scanner inputRadius = new Scanner(System.in);

        //Prompt user to enter value
        do {
            System.out.print("Enter radius(positive number only): ");
            radius = inputRadius.nextDouble();
        }while (radius < 0);

        // Compute area
        area = PI * (Math.pow(radius, 2));

        // Display area
        System.out.println("The area of Circle: " + area);
    }
}
