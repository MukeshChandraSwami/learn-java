package java14.records;

public class RecordMain {

    public static void main(String[] args) {
        StudentRecord st = new StudentRecord("Rahul", 101);
        System.out.println(st); // toString() method call, automatically provided by JVM.
        System.out.println(st.name()); // Getter method call, automatically provided by JVM.

    }
}
