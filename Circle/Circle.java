public class Circle {


    double radius;
     
    Circle(double radius) {
        this.radius = radius;
    }

     
    static double PI = 3.14;

    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area of circle: " + c.getArea());
    }
}
