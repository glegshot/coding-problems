package org.challenges.lambda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2Excercise {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Conan", "Doyale", 60),
                new Person("Hershell", "Gibbs", 50),
                new Person("Abel", "Tesfaye", 32),
                new Person("gleg", "shot", 29),
                new Person("amtrac", "mort", 58),
                new Person("Cole", "ashter", 12)
        );

        //sort using lambda and collections sort method
        Collections.sort(personList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        //print all the list
        performConditionally(personList, person -> true,(person) -> System.out.println(person));
        System.out.println();
        //print all person with starting name as C
        performConditionally(personList, person -> person.getFirstName().startsWith("C") || person.getFirstName().startsWith("c"), (person) -> System.out.println(person));

    }

    //replace the custom Condition interface for condtion check with a predicate instance and  Consumer parameter for the action to be performed
    public static void performConditionally(List<Person> personList, Predicate<Person> predicate, Consumer consumer) {

        for (Person person : personList) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }


}
