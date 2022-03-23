package java15.records;

public class RecordMain {

    public static void main(String[] args) {

        String name = getStudentName();
        System.out.println(name);

    }

    private static String getStudentName() {

        record Student(String name) {
            // any data manipulation logic
        }

        return new Student("Manish").name();
    }
}
