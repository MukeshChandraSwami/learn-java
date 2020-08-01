package java8.utils;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {
        StringJoiner stj = new StringJoiner(",");
        stj.add("1");
        stj.add("2");
        stj.add("3");
        System.out.println(stj);
    }
}
