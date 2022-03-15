package java8.threads;

public class EvenOddNumbersBy2Threads {

    private final int limit;
    private int num = 0;

    public EvenOddNumbersBy2Threads(int limit) {
        this.limit = limit;
    }

    private synchronized void printEvenNumber() {
        while (num <= limit) {
            try {
                if (num % 2 == 0) {
                    try {
                        System.out.println(num);
                        num += 1;
                        notify();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                this.wait(10);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private synchronized void printOddNumber() {
        while (num <= limit) {
            try {
                if (num % 2 != 0) {
                    try {
                        System.out.println(num);
                        num += 1;
                        notify();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                this.wait(10);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        EvenOddNumbersBy2Threads evenOdd = new EvenOddNumbersBy2Threads(20);

        Thread oddNums = new Thread(evenOdd::printOddNumber);
        Thread evenNums = new Thread(evenOdd::printEvenNumber);

        oddNums.start();
        evenNums.start();
    }
}
