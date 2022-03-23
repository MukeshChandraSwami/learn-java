package java17.switch_enhancement.main;

import java17.switch_enhancement.Circle;
import java17.switch_enhancement.GeometricalCalculation;
import java17.switch_enhancement.Rectangle;
import java17.switch_enhancement.Square;

public class GeometricalCalculationMain {

    public static void main(String[] args) {
        System.out.println("Area :- " + getArea(new Circle(10)));
        System.out.println("Perimeter :- " + getPerimeter(new Rectangle(10, 15.78)));
        System.out.println("Null:- " + getPerimeter(null));
    }
    private static double getPerimeter(GeometricalCalculation geoCal) {
        return switch (geoCal) {
            case Circle c && c.radius() > 5 -> c.perimeter();
            case Square s -> s.perimeter();
            case Rectangle r -> r.perimeter();
            case null -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + geoCal);
        };
    }
    private static double getArea(GeometricalCalculation geoCal) {
        if(geoCal instanceof Circle c) {
            return c.area();
        } else if(geoCal instanceof Square s) {
            return s.area();
        } else if(geoCal instanceof Rectangle r) {
            return r.area();
        }
        throw new IllegalStateException("Invalid argument passed:- " + geoCal);
    }
}
