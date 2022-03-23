package java16.time_format;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatEnhancement {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m B");

        LocalTime time = LocalTime.parse("10:21:59");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);

        time = LocalTime.parse("15:21:59");
        formattedTime = time.format(formatter);
        System.out.println(formattedTime);

        time = LocalTime.parse("21:21:59");
        formattedTime = time.format(formatter);
        System.out.println(formattedTime);

        time = LocalTime.parse("00:00:00");
        formattedTime = time.format(formatter);
        System.out.println(formattedTime);

    }
}
