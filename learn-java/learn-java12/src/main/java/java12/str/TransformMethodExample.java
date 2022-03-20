package java12.str;

import java.util.Random;
import java.util.function.Function;

public class TransformMethodExample {

    private static final Function<String, String> APPEND_RANDOM_NUMBER = t -> t + new Random(1000).nextLong();
    private static final Function<String, Long> PARSE_TO_LONG = Long::parseLong;

    public static void main(String[] args) {

        var s = "20";
        var l = s.transform(PARSE_TO_LONG) + 10;
        System.out.println(l);

        System.out.println(s.transform(APPEND_RANDOM_NUMBER));
    }

}
