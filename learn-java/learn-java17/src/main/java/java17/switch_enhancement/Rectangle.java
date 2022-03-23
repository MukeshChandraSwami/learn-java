package java17.switch_enhancement;

public record Rectangle(double length, double width) implements GeometricalCalculation {

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
