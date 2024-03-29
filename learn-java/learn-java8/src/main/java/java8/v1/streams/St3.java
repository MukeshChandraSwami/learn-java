package java8.v1.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class St3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,78,2,56,0,123,-1);

        findMinNumber(list);

        findMaxNumber(list);
    }

    private static void findMinNumber(List<Integer> list){

       int val =  list.stream().min((o1, o2) -> o1.intValue() > o2.intValue() ? o1.intValue() : o2.intValue()).get();
       System.out.println("Min : " + val);

       val = list.stream().min(Comparator.naturalOrder()).get();
       System.out.println("Min : " + val);

       val = list.stream().mapToInt(Integer::intValue)
               .min().getAsInt();
        System.out.println("Min : " + val);

        val = list.stream()
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("Min : " + val);
    }

    private static void findMaxNumber(List<Integer> list){
        int val = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max : " + val);

        OptionalInt max = list.stream().mapToInt(Integer::intValue)
                .max();
        if(max.isPresent()) {
            System.out.println("Max : " +  max.getAsInt());
        }
    }
}
