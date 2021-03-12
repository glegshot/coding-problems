package org.challenges.ctci;

public class QStringCompression {

    /**
     * solution with linear run time complexity
     * the solution assumes that there is no whitespaces in the string
     *
     * time complexity O(n) where n  is the length of the input string
     * space complexity O(2n)(worst case) ~ O(n) to store the appended new string
     *
     *
     * @param input
     * @return String the compressed form of the string
     */
    public String compressStringSolutionOne(String input) {

        StringBuilder outputBuilder = new StringBuilder();
        char prev = ' ';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (prev == input.charAt(i)) {
                count++;
            } else {
                if (prev != ' ') {
                    outputBuilder.append(prev);
                    outputBuilder.append(count);
                }
                prev = input.charAt(i);
                count = 1;
            }
        }

        outputBuilder.append(prev);
        outputBuilder.append(count);

        if(outputBuilder.toString().length() > input.length()){
            return input;
        }

        return outputBuilder.toString();

    }

}
