public class Circle {
    //State or Data field
    double radius;
    //No argument constructor
    Circle(){
        System.out.println("Hello circle!");
    }
    //One argument constructor
    Circle(double radius){
        setRadius(radius);
        System.out.println("Area of circle: " + getArea());
    }

    //Behaviour or methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}
