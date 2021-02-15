package org.challenges.lambda.practice;

import java.util.List;
import java.util.Optional;

public class OldestPerson {

    //rewrite the logic using java8 features
    public static Person getOldestPerson(List<Person> people) {
        /**Person oldestPerson = new Person("", 0);
         for (Person person : people) {
         if (person.getAge() > oldestPerson.getAge()) {
         oldestPerson = person;
         }
         }
         return oldestPerson;**/

        Optional<Person> oldestPerson = people.stream().max((o1, o2) -> o1.getAge() - o2.getAge());
        return oldestPerson.get();

    }

     public static class Person {

        private String name;
        private int age;
        private String nationality;

        public Person(String name, int age, String nationality) {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
        }

        public Person(String name, int age) {
            this(name, age, "");
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getNationality() {
            return nationality;
        }
    }

}


