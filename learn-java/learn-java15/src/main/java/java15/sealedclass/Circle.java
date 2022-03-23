package java15.sealedclass;

public sealed class Circle extends Shape permits DarcCircle  {

    @Override
    public void printShape() {

    }
}
