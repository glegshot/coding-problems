/**
 * This is a demo implementation of StringBuilder class
 * <p>
 * for simplicity sake the append operation only accepts a char type
 * we can overload the append method to accept multiple types
 *
 *
 */
package org.challenges.ctci;


public class CStringBuilder {

    private char[] array;
    private int size;
    private int index;

    public CStringBuilder() {
        this.size = 10;
        this.array = new char[this.size];
        this.index = 0;
    }

    public void append(char c) {
        if (this.index >= this.size) {
            this.size += 10;
            char[] temp = new char[this.size];
            this.array = copyArray(temp, this.array);
        }
        this.array[this.index] = c;
        this.index++;
    }

    private char[] copyArray(char[] temp, char[] array) {
        for (int i = 0; i < array.length; i++ ) {
            temp[i] = array[i];
        }
        return temp;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < this.index; i++) {
            string += this.array[i];
        }
        return string;
    }

}
