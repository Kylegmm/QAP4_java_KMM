package Problem1;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 10, 5),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("EquilateralTriangle", 6)
        };

        System.out.println("Before Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale shapes
        scaleShapes(shapes, 2);

        System.out.println("\nAfter Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                ((Scalable) shape).scale(factor);
            }
        }
    }
}