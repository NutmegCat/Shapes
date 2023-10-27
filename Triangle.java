// Aaron Prince Anu

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area () {
        double u = perimeter() / 2;
        return Math.sqrt(u * (u - a) *  (u - b) * (u - c));
    }

    public double perimeter () {
        return a + b + c;
    }
}