package java17.rndm;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorExample {

    public static void main(String[] args) {
        RandomGeneratorFactory.all()
                .toList().forEach(r -> System.out.println(r.name() + " :- " + r.group()));

        RandomGenerator rndmGenrator = RandomGeneratorFactory.of("L64X1024MixRandom").create();
        for(int i = 0; i < 10; i++)
            System.out.println(rndmGenrator.nextInt(20));
    }
}
