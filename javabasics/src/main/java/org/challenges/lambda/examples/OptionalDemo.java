package org.challenges.lambda.examples;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        //empty optional Object
        Optional<String> optionalString = Optional.empty();
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString);

        //this will throw null pointer exception
        //Optional<String> nullStringOptional = Optional.of(null);

        Optional<String> nullStringOptional = Optional.ofNullable(null);
        System.out.println(nullStringOptional.isPresent());

        //optional with value
        Optional<String> optionalWithValue = Optional.ofNullable("Hello");
        System.out.println(optionalWithValue.isPresent());
        optionalWithValue.ifPresent(System.out::println);



    }

}
