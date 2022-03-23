package java15.sealedclass;

public abstract sealed class Shape permits Square, Rectangle, Circle {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape() {
        this("Anonymous");
    }

    public void printShape() {
        System.out.println("Name of shape :- " + name);
    }
}
