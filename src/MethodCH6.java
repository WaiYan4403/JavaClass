public class MethodCH6 {
    public static void main(String[] args) {
        sum(1,10);
        sum(20,37);
        sum(35,49);
    }

    public static void sum(int initNum,int endNum){
        int result = 0;
        for(int i = initNum; i <= endNum; i++){
            result += i;
        }
        System.out.println("Sum from " + initNum + " to " + endNum + " is: " + result);
    }
}
