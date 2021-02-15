package org.challenges.lambda.examples;

public class RunnableDemo {

    public static void main(String[] args) {

        Runnable runnableLambda = () -> {
            String name = "local variable";
            System.out.println(Thread.currentThread().getId());
            System.out.println("this is "+name);
        };

        Thread thread = new Thread(runnableLambda);
        thread.start();

    }


}
