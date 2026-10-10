package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.round(3.14 * radius * radius * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("Circle (radius %.1f cm)", radius);
    }
}