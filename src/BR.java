public class BR {
    public static void main(String[] args) {
        int age=20;
        String name="Bawk Ring";

        PrintInfo(name,age);

        int returnResult = Addition(3,5);
        System.out.println(returnResult);

//        System.out.println("my name is "+name+" I am "+age+ " years old");
//
//        if (age<=19){
//            System.out.println("Teenager");
//        }
//        else if(age<=30){
//            System.out.println("Adult");
//        }
//        else{
//            System.out.println("Old");
//        }
//
//        switch (name){
//            case "Bawk Ring":
//                System.out.println("Bawk ring");
//                break;
//            case "lu lu":
//                System.out.println("Lu Lu");
//                break;
//            case "Mya Mya":
//                System.out.println("Mya Mya");
//                break;
//        }
//
//        age=45;
//        name="lu lu";
//        System.out.println("my name is "+name+" I am "+age+ " years old");

        /*if (age<=19){
            System.out.println("Teenager");
        }
        else if(age<=30){
            System.out.println("Adult");
        }
        else{
            System.out.println("Old");
        }
        //for loop
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
        //while loop
        int index=0;
        while (index<10){
            if (index==5)
                break;
            System.out.println(index);
            index++;
        }
        //do while
        index=0;
        do{
            System.out.println(index);
            index++;
        }while (index<10);*/

    }

    public static void PrintInfo(String name,int age){
        System.out.println("my name is " + name + ", I am "+ age +" years old");
    }

    public static int Addition(int num1,int num2){
        int result = num1 + num2;
        return result;
    }
}
