package java17.switch_enhancement;

public record Square(double side) implements GeometricalCalculation {
    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
