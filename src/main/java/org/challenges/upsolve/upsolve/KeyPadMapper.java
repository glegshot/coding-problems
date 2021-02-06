package org.challenges.upsolve.upsolve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyPadMapper {

    Map<Character, Integer> keyMap;

    // o(n2) solution ,need to make better preferable o(n) or lesser.
    public KeyPadMapper() {
        this.keyMap = new HashMap<>();
        keyMap.put('a', 2);
        keyMap.put('b', 2);
        keyMap.put('c', 2);
        keyMap.put('d', 3);
        keyMap.put('e', 3);
        keyMap.put('f', 3);
        keyMap.put('g', 4);
        keyMap.put('h', 4);
        keyMap.put('i', 4);
        keyMap.put('j', 5);
        keyMap.put('k', 5);
        keyMap.put('l', 5);
        keyMap.put('m', 6);
        keyMap.put('n', 6);
        keyMap.put('o', 6);
        keyMap.put('p', 7);
        keyMap.put('q', 7);
        keyMap.put('r', 7);
        keyMap.put('s', 7);
        keyMap.put('t', 8);
        keyMap.put('u', 8);
        keyMap.put('v', 8);
        keyMap.put('w', 9);
        keyMap.put('x', 9);
        keyMap.put('y', 9);
        keyMap.put('z', 9);

    }

    public List getMatchList(int code, List<String> stringList) {

        List<String> results = new ArrayList<>();

        Integer codeInt = new Integer(code);
        String codeString = codeInt.toString();

        for (String str : stringList) {
            Integer resultCode = new Integer(0);
            if (codeString.length() == str.length()) {
                for (int i = 0; i < str.length(); i++) {
                    resultCode = resultCode * 10 + (Integer) this.keyMap.get(str.charAt(i));
                }
                if (resultCode == code)
                    results.add(str);
            }
        }

        return results;
    }

    public static void printList(List results) {

        results.stream().forEach(System.out::println);

    }
}