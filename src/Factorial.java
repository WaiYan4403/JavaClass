public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        int result = 1;
        
        for(int i = num;i >= 1;i--){
            System.out.println(i);
            result *= i;
        }
        System.out.println(result);
    }
}
