package java9.jpms;

import java.sql.Connection;

public class GetModuleName {

    public static void main(String[] args) {
        System.out.println(String.class.getModule());
        System.out.println(Connection.class.getModule());
    }
}
