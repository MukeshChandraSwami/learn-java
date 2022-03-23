package java15.sealedclass.main;

import java15.sealedclass.Shape;
import java15.sealedclass.Square;

public class SealedBox extends Square {

    public SealedBox(String name) {
        super(name);
    }

    @Override
    public void printShape() {
        System.out.println("It is sealed box");
    }

    public static void main(String[] args) {
        Shape s = new SealedBox("Sealed Box");
        s.printShape();
    }
}
