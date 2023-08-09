public class Circle extends Shape {

    public Circle(double r) {
        super(r,r);
    }

    public double getArea() {
        return Math.PI * width * height ;
    }

    public double getPerimeter() {
        return 2 * Math.PI * width;
    }
}
