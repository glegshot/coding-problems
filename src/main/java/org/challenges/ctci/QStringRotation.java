package org.challenges.ctci;

public class QStringRotation {

    /**
     * solution to check if the string is a rotated string of another string
     * <p>
     * time complexity O(n*n) where n = length of the source string
     * space complexity O(n)
     * <p>
     * we rotate the value string by one position and compare with subString
     * continue this for n times to verify
     *
     * @param value
     * @param subValue
     * @return boolean
     */
    public boolean isSubStringSolutionOne(String value, String subValue) {

        int totalRotation = value.length();

        for (int i = 0; i < totalRotation; i++) {
            if (value.equals(subValue)) {
                return true;
            }
            value = rotateString(value);
        }

        return false;
    }


    /**
     * method to rotate a given string to right by one position
     *
     * @param value
     * @return String rotate string value
     */
    private String rotateString(String value) {
        //store last value in buffer variable
        char temp = value.charAt(value.length() - 1);
        char[] valueArray = value.toCharArray();
        for (int i = value.length() - 1; i > 0; i--) {
            valueArray[i] = valueArray[i - 1];
        }
        valueArray[0] = temp;
        return new String(valueArray, 0, valueArray.length);
    }


}
