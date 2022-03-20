package java12.str;

public class IndentMethodExample {

    public static void main(String[] args) {

        String s = "Java 12 features.";

        System.out.println("Original String:- " + s);
        System.out.println("Positive indent:- " + s.indent(5));
        System.out.println("Negative indent:- " + s.indent(-5));
        s = " ".repeat(4) + s + " ".repeat(4);
        System.out.println("Negative indent(After adding spaces):- " + s.indent(-5));
    }
}
