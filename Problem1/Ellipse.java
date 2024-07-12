package Problem1;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(String name, double a, double b) {
        super(name);
        if (a >= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3*(a + b) - Math.sqrt((3*a + b)*(a + 3*b)));
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}