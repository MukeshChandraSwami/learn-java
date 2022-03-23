package java15.sealedclass;

public non-sealed class Square extends Shape {

    public Square(String name) {
        super(name);
    }

    @Override
    public void printShape() {
        System.out.println("It is a Square");
    }
}
