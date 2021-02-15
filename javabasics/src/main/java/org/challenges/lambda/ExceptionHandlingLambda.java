package org.challenges.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlingLambda {

    public static void main(String[] args) {

        int[] numbers = new int[]{8, 3, 0, 2, 1};
        int key = 0;

        //pass the lambda into a wrapper method that creates a similar consumer wrapper lambda
        process(numbers, key, wrapperLambda((u,v) -> System.out.println(u/v)));

    }

    public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i,key);
        }
    }

    //a method which accepts a consumer and wraps it in another lambda to handle exception and returns the new wrapperlambda
    public static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v,k);
            } catch (ArithmeticException e) {
                System.out.println("Exception Occured");
            }
        };
    }

}
