public class ShapeDriver {
  public static void main(String[] args) {
    Rectangle r = new Rectangle(3, 5);
    Triangle t = new Triangle(3, 4, 5);
    Square s = new Square(8);
    System.out.println("r area is " + r.area() + ", r parameter is " + r.perimeter());
    System.out.println("t area is " + t.area() + ", t parameter is " + t.perimeter());
    System.out.println("s area is " + s.area() + ", s parameter is " + s.perimeter());
  }
}