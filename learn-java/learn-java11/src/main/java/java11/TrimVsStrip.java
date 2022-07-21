package java11;

public class TrimVsStrip {

    public static void main(String[] args) {

        char spaceUnicode = '\u2000';
        String str = spaceUnicode + "My name is Mukesh";

        String trimmed = trim(str);
        System.out.println(trimmed + " :- " + trimmed.length());

        String stripped = strip(str);
        System.out.println(stripped + " :- " + stripped.length());
    }

    private static String strip(String str) {
        return str.strip();
    }

    private static String trim(String str) {
        return str.trim();
    }
}