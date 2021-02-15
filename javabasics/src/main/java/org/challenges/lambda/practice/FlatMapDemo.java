package org.challenges.lambda.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public void flatMapDemonstration() {

        List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));

        List<String> newCollection = collection.stream().flatMap(entry -> entry.stream()).collect(Collectors.toList());

        newCollection.stream().forEach(System.out::println);

    }

    public static void main(String[] args) {
        FlatMapDemo flatMapDemo = new FlatMapDemo();
        flatMapDemo.flatMapDemonstration();
    }

}
