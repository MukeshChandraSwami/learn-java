package java14.npe;

public class NPE {

    public static void main(String[] args) {
        String s = null;
        int length = s.length();
        System.out.println(length);
    }
}
