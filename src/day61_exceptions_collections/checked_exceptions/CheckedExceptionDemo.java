package day61_exceptions_collections.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("about to sleep for 5 seconds ");
        /**
         * Thread.sleep(1000);
         * cause an interrupted Exception, which is a checked exception
         * we are handling it below w/ try and catch
         */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("woke up after 5 seconds");
        /**
         * Declaring using throws Keyword
         */
        Thread.sleep(5000);

    }



}

