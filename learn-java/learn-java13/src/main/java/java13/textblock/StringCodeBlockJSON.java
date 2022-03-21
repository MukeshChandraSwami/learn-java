package java13.textblock;

public class StringCodeBlockJSON {

    private static final String NAME = "Mukesh Swami";
    private static final int SALARY = 12000;

    public static void main(String[] args) {

        String jsonOldWay = "{" +
                "\"name\" :  \"Mukesh Swami\"," +
                "\"Salary\": 12000" +
                "}";
        System.out.println("JSON before String Code Block Feature:-");
        System.out.println(jsonOldWay);

        String jsonNewWay = """
                {
                    "name":  "%s",
                    "Salary": %d
                }
                """;
        String formattedString = String.format(jsonNewWay, NAME, SALARY);

        /*
        We can use above format to make placeholders for variables.
        Before java-15:-
        String.format(jsonNewWay, NAME,SALARY)

        From Java-15:-
        jsonNewWay.formatted(NAME,SALARY)
        */

        System.out.println("\nJSON after String Code Block Feature:-");
        System.out.println(jsonNewWay);
        System.out.println(formattedString);
    }
}
