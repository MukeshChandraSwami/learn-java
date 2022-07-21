package java8.completable.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = cretae(2);

        future.thenAccept(CompletableFutureTest::printIt);
        /*.thenRun(() -> System.out.println("This never die : " + Thread.currentThread()));*/

        sleep(1000);
    }

    private static CompletableFuture<Integer> cretae(int i) {
        CompletableFuture<Integer> fc = CompletableFuture.supplyAsync(() -> compute(i));
        return fc;
    }

    private static Integer compute(int i) {
        System.out.println("Compute: " + Thread.currentThread());
        sleep(1000);
        return i;
    }

    private static void printIt(Integer i) {

        System.out.println(i + " : " + Thread.currentThread());
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }
    }
}
