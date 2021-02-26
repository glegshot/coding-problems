package org.demo1;

class Runner extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getId() + ":" + i);

                Thread.sleep(100);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}


public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.start();

    }

}
