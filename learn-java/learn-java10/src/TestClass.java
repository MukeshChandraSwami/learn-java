import java.util.List;
import java.util.stream.Collectors;

public class TestClass {


    public static int get(){

        var arr = l();
        System.out.println(arr);
        return 10;
    }

    private static int l() {
        return 10;
    }

    public static void collectors(){

        List<Integer> l = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> collect = l
                .stream()
                .map(i -> i * 2)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        collect.add(10);
    }
}
