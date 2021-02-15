package org.challenges.lambda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Unit1Excercise {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Conan", "Doyale", 60),
                new Person("Hershell", "Gibbs", 50),
                new Person("Abel", "Tesfaye", 32),
                new Person("gleg", "shot", 29),
                new Person("amtrac", "mort", 58),
                new Person("Cole", "ashter", 12)
        );

        //sort based on firstname
        //streams approach
        personList = personList.stream().sorted((p1, p2) -> (p1.getFirstName().compareTo(p2.getFirstName()))).collect(Collectors.toList());

        //print the sorted list
        //streams approach
        personList.forEach(p1 -> System.out.println(p1));

        System.out.println();
        //create method that prints all people with first name starting with C
        //streams approach
        personList.stream().filter(p1 -> p1.getFirstName().charAt(0) == 'C' || p1.getFirstName().charAt(0) == 'c').forEach(p1 -> System.out.println(p1));

        System.out.println();
        //shuffling to make the list random
        Collections.shuffle(personList);

        //sort using lambda and collections sort method
        Collections.sort(personList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        //print all the list
        printList(personList, person -> true);
        System.out.println();
        //print all person with starting name as C
        printList(personList, person -> person.getFirstName().startsWith("C") || person.getFirstName().startsWith("c"));

    }


    //method to print the list based on condition specified
    public static void printList(List<Person> personList, Condition condition) {

        for (Person person : personList) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    //private interface accessible to enclosing class only
    private interface Condition {
        public boolean test(Person person);
    }

}

//POJO class for storing data
class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
