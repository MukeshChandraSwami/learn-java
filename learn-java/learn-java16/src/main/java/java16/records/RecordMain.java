package java16.records;

public class RecordMain {

    static class VehicalUses {
        public Vehical v = new Vehical("Truck", 1971);
    }

    public static void main(String[] args) {
        RecordMain.VehicalUses vehicalUses = new RecordMain.VehicalUses();
        System.out.println(vehicalUses.v);
    }
}
