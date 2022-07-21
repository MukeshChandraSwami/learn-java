package java8.completable.future;

import java.util.concurrent.*;

public class ComFutureCompleteMethod {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFuture = create();

        completableFuture.thenAccept(ComFutureCompleteMethod::printIt);

        //sleep(2000);
        /*CompletableFuture<String> stringCompletableFuture = completableFuture.toCompletableFuture();
        System.out.println(stringCompletableFuture.get());*/
    }

    private static CompletableFuture<String> create() {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        return CompletableFuture.supplyAsync(ComFutureCompleteMethod::askForValue, ex);
    }

    private static String askForValue() {
        System.out.println("A : " + Thread.currentThread());
        sleep(1000);
        return "Java Asynchronous Programming Practice";
    }

    private static void printIt(String str) {
        System.out.println("P : " + Thread.currentThread());
        System.out.println(str);
    }
    private static void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
