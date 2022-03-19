package java12.switchexp;

public class SwitchExp {

    public static void main(String[] args) {

        var num = 1;
        oldVersion(num);
        
        newVersion(num);

        returnValueViaArrow(num);

        multipleCaseWithBreak(num);

        switchWithBlock(num);

        returnValueViaYield(num);
    }

    private static void returnValueViaYield(int num) {

        int status = switch (num) {
            case 1,2,3 ->{
                var n = 1000;
                // Do some operation.
                // DB connection etc.
                System.out.println("1 to 3 With block + n :- " + n);
                yield num * 2;
            }
            case 4 -> 4;
            case 5,6 -> 10;
            default -> num;
        };

        System.out.println("Yield Example :- " + status);
    }

    private static void switchWithBlock(int num) {

        switch (num) {
            case 1,2,3 -> {
                var n = 1000;
                // Do some operation.
                // DB connection etc.
                System.out.println("1 to 3 With block + n :- " + n);

            }
            case 4 -> System.out.println("Only 4 : NEW");
            case 5,6 -> System.out.println("5 and 6 : NEW");
            default -> System.out.println("Default : NEW");
        }
    }

    private static void multipleCaseWithBreak(int num) {
        var status = 0;

        switch (num) {
            case 1,2,3:
                status = 10;
                break;
            case 4:
                status = 20;
                break;
            case 5,6:
                status = 30;
                break;
            default:
                status = num;
        }

        System.out.println("multipleCaseWithBreak :- " + status);
    }

    private static void returnValueViaArrow(int num) {
       var status = switch (num) {
            case 1,2,3 -> 10;
            case 4 -> 20;
            case 5,6 -> 30;
            default -> num;
        };

        System.out.println("Status :- " + status);
    }

    private static void newVersion(int num) {

        switch (num) {
            case 1,2,3 -> System.out.println("1 to 3 : NEW");
            case 4 -> System.out.println("Only 4 : NEW");
            case 5,6 -> System.out.println("5 and 6 : NEW");
            default -> System.out.println("Default : NEW");
        }
    }

    private static void oldVersion(int num) {
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("1 to 3");
                break;
            case 4:
                System.out.println("Only 4");
                break;
            case 5:
            case 6:
                System.out.println("5 and 6");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
