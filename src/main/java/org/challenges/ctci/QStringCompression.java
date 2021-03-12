package org.challenges.ctci;

public class QStringCompression {

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
