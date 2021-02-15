package org.challenges.lambda.practice;


import java.util.Arrays;

//return the total number of letters in all the names with more than 5 letters
public class LetterCount {

    public int getLetterCount(String... names){
        return Arrays.stream(names)
                .filter(name -> name.length()>5)
                .mapToInt(name -> name.length())
                .sum();
    }

}
