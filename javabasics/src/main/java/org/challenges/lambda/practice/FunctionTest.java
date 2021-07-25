package org.challenges.lambda.practice;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Hello c = new Hello();
        Function<String,String> requestFunction = s -> c.getMeHello(s);
        System.out.println("will apply the function");
        requestFunction.apply("glegshot");
    }

}


class Hello{

    public String getMeHello(String name){
        System.out.println("in getMeHello");
        String message = "Hello, "+name;
        return message;
    }


}



