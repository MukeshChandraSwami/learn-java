public class Java11Main {

    public static void main(String[] args) {

        linesTest();
    }


    public static void stripTest() {
        Character ch = '\u2000';
        boolean space = Character.isWhitespace(ch);
        System.out.println(space);
    }

    public static void stripAndTrimTest(){

        Character ch = '\u2000'; // \u0020 & \u0000 & \u2000
        String s = ch + "Mukesh" + ch;

        System.out.println("Trim :-" + s.trim() + "Done!");
        System.out.println("Strip :-" + s.strip() + "Done!");
    }

    public static void blankTest() {
        String str = " ";
        System.out.println("Blank :- " + str.isBlank());
        System.out.println("Empty :- " + str.isEmpty());
    }

    public static void repeatTest() {

        String str = "s";
        System.out.println(str.repeat(2));
    }

    public static void linesTest() {
        String str = "My\nname\nis\nkhan";
        str.lines().forEach((var s) -> {
            System.out.println(s);
        });
    }
}
