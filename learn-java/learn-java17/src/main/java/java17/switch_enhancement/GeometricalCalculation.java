package java17.switch_enhancement;

public sealed interface GeometricalCalculation permits Circle, Rectangle, Square {

    double area();
    double perimeter();
}
