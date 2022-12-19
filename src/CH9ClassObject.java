public class CH9ClassObject {
    public static void main(String[] args) {

        Circle myCircle = new Circle();

        Circle myCircle1 = new Circle(20);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle1.getArea());
    }
}
