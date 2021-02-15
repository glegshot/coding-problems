package org.challenges.lambda.practice;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    //rewrite this method with streams and lambdas
   /* public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;

    }*/

   public static Collection<String> mapToUppercase(String... names){

       return Arrays.stream(names).map(name -> name.toUpperCase()).collect(Collectors.toList());

   }

}