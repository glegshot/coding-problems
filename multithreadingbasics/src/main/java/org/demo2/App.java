package org.demo2;

import java.util.stream.IntStream;


class Runner implements Runnable {

    @Override
    public void run() {

        IntStream intStream = IntStream.iterate(0, i -> i + 1);
        intStream.limit(10).forEach(value -> System.out.println(Thread.currentThread().getId() + ":" + value));

    }
}


public class App {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getId() + " Main Thread");
        Thread thread = new Thread(new Runner());
        thread.start();

    }

}
