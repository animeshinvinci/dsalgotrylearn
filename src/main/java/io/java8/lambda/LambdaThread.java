package io.java8.lambda;

public class LambdaThread {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println(" Anonymous Thread way");
            }
        };

        Runnable r2 = () -> {

                System.out.println(" Lambda Expression Thread way");
            };

        Thread t1 = new Thread(r1);

        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
