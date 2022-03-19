package java11;

public class TrimVsStrip {
    public static void main(String[] args) {

        String preAndPost = "***";
        String str = "   My name is Mukesh\t\t";

        String trimmed = trim(str);
        System.out.println(preAndPost + trimmed + preAndPost);

        String stripped = strip(str);
        System.out.println(preAndPost + stripped + preAndPost);
    }

    private static String strip(String str) {
        return str.strip();
    }

    private static String trim(String str) {
        return str.trim();
    }
}
