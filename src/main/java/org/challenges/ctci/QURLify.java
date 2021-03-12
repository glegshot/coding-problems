package org.challenges.ctci;

public class QURLify {


    /**
     *
     * solution using shifting the characters and inserting the encoded character as replacement for space
     *
     * time complexity O(n+2m) ~ O(n+m) where n = length of the input string, m = number of whitespace characters(each whitespace will be replaced with three characters)
     * space complexity O(n+2m) ~ O(n+m)
     *
     *
     * @param input
     * @param trueLength
     * @return char[] output char array of encoded value
     */
    public char[] performURLifyByShifting(char[] input, int trueLength) {

        int i = trueLength-1;
        int j = input.length-1;
        char[] encodeArray = new char[]{'%', '2', '0'};

        while (i >= 0) {
            if (input[i] != ' ') {
                input[j] = input[i];
                i--;
                j--;
            } else if (input[i] == ' ') {
                j = appendCharacterEncodeForSpace(input, encodeArray, j);
                i--;
            }
        }

        return input;
    }

    private int appendCharacterEncodeForSpace(char[] input, char[] encodeArray, int j) {

        for (int counter = encodeArray.length - 1; counter >= 0; j--, counter--) {
            input[j] = encodeArray[counter];
        }
        return j;

    }

}
