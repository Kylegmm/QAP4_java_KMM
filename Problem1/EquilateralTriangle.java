package Problem1;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}