package java11;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorEnhancement {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>(){
            @Override
            public boolean add(String s) {
                return super.add(s);
            }
        };

        l.add("name");
        System.out.println(l);
    }
}
