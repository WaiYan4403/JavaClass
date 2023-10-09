import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        /*//Variables
        double decimalNumber = 0.5; //float
        long age = 31;//int
        boolean female = false;//bool
        String name = "Mya Mya";//string

        //Print
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old.");

        // If, else, else if Statement
        if(age <= 19){
            System.out.println("Teenager");
        }
        else if(age <= 30){
            System.out.println("Adult");
        }
        else{
            System.out.println("Old");
        }

        //Switch Statement
        int index = 3;
        switch (index){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        }

        //For loop
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //while
        //int index = 0;
        while (index < 10){
            if(index == 5){
                break;
            }
            System.out.println("Mya Mya");
            index++;
        }

        //do while
        do{
            System.out.println("Mya Mya");
            index++;
        }while (index < 5);*/

        //Array
        int[] testArray = new int[5];
        int[] indexArray = {2, 1, 5, 3, 7};

        //Assigning values to the array
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 4;
        testArray[3] = 5;
        testArray[4] = 3;

        //Print Array 4
        System.out.println(indexArray[4]);


        //List
        ArrayList<String> testList = new ArrayList<String>();

        //Adding items to the list
        testList.add("Bawk Ring");
        testList.add("Mya Mya");

        //Removing item from the list
        testList.remove("Bawk Ring");

        //foreach loop
        for (String index: testList) {
            System.out.println(index);
        }
    }
}
