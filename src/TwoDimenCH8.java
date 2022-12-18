import java.util.Scanner;

public class TwoDimenCH8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][3];

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                sum += matrix[row][col];
            }
        }
        System.out.print("Sum is " + sum);
    }
}
