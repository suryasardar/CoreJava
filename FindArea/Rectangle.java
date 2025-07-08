public class Rectangle{
 public double length;
 public double breadth;

 public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
    public static void main(String[] args) {
         Rectangle rect = new Rectangle(10.0, 5.0);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}